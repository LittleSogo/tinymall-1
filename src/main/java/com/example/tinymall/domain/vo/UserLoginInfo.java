package com.example.tinymall.domain.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginInfo {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
