package com.example.style.coremodule.entity.entity;

/**
 * Created by lenove on 2016/8/9.
 */
public class Constant {
    //网络基准链接
    public static String HTTP_WEB="http://123.206.87.139/LoveHomeTownServer";
    //获取城市信息
    public static String HTTP_CITYNAME=HTTP_WEB+"/printCity";
    //获取父分类信息
    public static String HTTP_CATEGORY=HTTP_WEB+"/printCategory";
    //查询发布信息
    public static String HTTP_INFO=HTTP_WEB+"/detailInfo";
    //用户登录
    public static String HTTP_LOGIN=HTTP_WEB+"/isLogin";
    //修改用户密码
    public static String HTTP_UPDATEPWD=HTTP_WEB+"/updatePwd";

    //修改用户信息    //请求方式post
    public static String HTTP_UPDATEUSER=HTTP_WEB+"/updateUser";
    //添加发布信息    //请求方式post
    public static String HTTP_ADD_DETAIL=HTTP_WEB+"/addDetail";
    //修改发布信息    //请求方式post
    public static String HTTP_UPDATE_DETAIL=HTTP_WEB+"/updateDetail";
    //注册用户信息
    public static String HTTP_REGISTER_USER=HTTP_WEB+"/registerUser";
    //获取验证码
    public static String HTTP_CODE=HTTP_WEB+"/scanCode";
    //删除发布信息
    public static String HTTP_DEL_DETAILE=HTTP_WEB+"/delDetail";
    //核对验证码
    public static String HTTP_CHECK_CODE=HTTP_WEB+"/checkCode";
    //忘记密码
    public static String HTTP_FORGET_PWD=HTTP_WEB+"/forgetPwd";

}
