package com.example.tinymall.controller.admin;

import com.example.tinymall.common.annotation.ResponseResult;
import com.example.tinymall.common.enums.ResultCode;
import com.example.tinymall.common.helper.LoginTokenHelper;
import com.example.tinymall.common.result.CommonResult;
import com.example.tinymall.core.utils.*;
import com.example.tinymall.entity.TinymallAdmin;
import com.example.tinymall.model.dto.UserInfo;
import com.example.tinymall.model.vo.UserLoginInfo;
import com.example.tinymall.service.TinymallAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AdminAuthController
 * @Description
 * @Author jzf
 * @Date 2020-4-28 15:03
 */
@ResponseResult
@RestController
@RequestMapping("/admin/user")
@ResponseStatus(HttpStatus.OK)
@Api(tags = "管理后台权限操作")
public class AdminAuthController {

    @Autowired
    private TinymallAdminService adminService;

    @PostMapping("/login")
    @ApiOperation(value = "用户登录", notes="用户登录")
    @ApiImplicitParam(name = "userLoginInfo", value = "用户登录信息", paramType = "UserLoginInfo", required = true, dataType = "UserLoginInfo")
    public Object login(@RequestBody UserLoginInfo userLoginInfo, HttpServletRequest request) {
        String username = userLoginInfo.getUsername();
        String password = userLoginInfo.getPassword();
        AssertUtils.isFalse(username == null || password == null,"用户名或密码不能为空");

        List<TinymallAdmin> userList = adminService.queryByUsername(username);
        TinymallAdmin user = null;
        AssertUtils.isFalse(userList.size() > 1, ResultCode.USER_HAS_EXISTED);
        AssertUtils.isFalse(userList.size() == 0,ResultCode.USER_NOT_EXIST);
        user = userList.get(0);

        boolean result = MD5Util.validDigest(password,user.getPassword());
        AssertUtils.isTrue(result,ResultCode.USER_LOGIN_ERROR);

        // 更新登录情况
        user.setLastLoginTime(LocalDateTime.now());
        user.setLastLoginIp(IpUtil.getIpAddr(request));
        user.setRoleIds(user.getRoleIds());
        AssertUtils.isFalse(adminService.updateByPk(user.getId(),user) == 0, "账号不存在");

        // userInfo
        UserInfo userInfo = new UserInfo();
        userInfo.setName(username);
        userInfo.setAvatarUrl(user.getAvatar());
        userInfo.setRoles(user.getRoleIds());

        // token
        String token = LoginTokenHelper.generateToken(user.getId());

        Map<Object, Object> resultMap = new HashMap<Object, Object>();
        resultMap.put("token", token);
        resultMap.put("userInfo", userInfo);
        return resultMap;
    }

    @PostMapping("logout")
    public Object logout() {
        return CommonResult.success();
    }

    @GetMapping("info")
    public Object info(String token) {
        AssertUtils.notBlank(token,"用户未登录");
        int userId = LoginTokenHelper.getUserId(token);
        TinymallAdmin tinymallAdmin = adminService.selectByPk(userId);
        UserInfo userInfo = new UserInfo();
        userInfo.setAvatarUrl(tinymallAdmin.getAvatar());
        userInfo.setName(tinymallAdmin.getUsername());
        userInfo.setRoles(tinymallAdmin.getRoleIds());
        return userInfo;
    }
}
