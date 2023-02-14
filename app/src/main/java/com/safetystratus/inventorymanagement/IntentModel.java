package com.safetystratus.inventorymanagement;

public class IntentModel {
    public String site_id;
    public String user_id;
    public String token;
    public String md5;
    public String sso;
    public String empName;
    public String site_name;
    public String loggedinUsername;

    public IntentModel(String site_id, String user_id, String token, String md5, String sso, String empName, String site_name, String loggedinUsername) {
        this.site_id = site_id;
        this.user_id = user_id;
        this.token = token;
        this.md5 = md5;
        this.sso = sso;
        this.empName = empName;
        this.site_name = site_name;
        this.loggedinUsername = loggedinUsername;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSso() {
        return sso;
    }

    public void setSso(String sso) {
        this.sso = sso;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getLoggedinUsername() {
        return loggedinUsername;
    }

    public void setLoggedinUsername(String loggedinUsername) {
        this.loggedinUsername = loggedinUsername;
    }
}