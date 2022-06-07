package com.demo.fit.utils;

public class UserUtils {

    public static final String USERNAME = "token";
    public static final String PHONE = "phone";
    public static final String LOGIN = "login";

    public static String getUserName() {
        return CommonUtil.getStringFromSP(USERNAME);
    }

    public static void setUserName(String userName) {
        CommonUtil.putString2SP(USERNAME, userName);
    }

    public static String getUserPhone() {
        return CommonUtil.getStringFromSP(PHONE);
    }

    public static void setUserPhone(String phone) {
        CommonUtil.putString2SP(PHONE, phone);
    }

    public static boolean isLogin() {
        return CommonUtil.getBooleanFromSP(LOGIN);
    }

    public static void setLogin(boolean login) {
        CommonUtil.putBoolean2SP(LOGIN, login);
    }

}
