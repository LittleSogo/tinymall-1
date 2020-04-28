# Tinymall

一个小型电商网站，包括微信小程序、管理后台

## swagger接口文档

http://localhost:8090/swagger-ui.html

## 技术点
- mybatis
- springboot
- mybatis-plus
- easyExcel

## 接口响应体格式统一封装
1. Result 是返回格式类的父接口（所有返回格式类都需要继承它）
2. PlatformResult 通用返回结果格式（我们上面说的第二种返回结果）
3. DefaultErrorResult 全局错误返回结果（我们上面说的第一种错误时的返回结果）
4. GlobalExceptionHandler全局异常处理
5. ResponseResult 注解类（用于在Controller上指定返回值格式类）
6. ResponseResultInterceptor 拦截器（主要用于将ResponseResult注解类的标记信息传入ResponseResultHandler中）
7. ResponseResultHandler 响应体格式处理器（主要转换逻辑都在这里）


## 参考博客
https://blog.csdn.net/aiyaya_/article/details/78976759