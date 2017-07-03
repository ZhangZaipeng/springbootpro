package com.hwz.staff.domain;

import java.util.Date;

/**
 * Created by ZhangZaipeng on 2017/7/1.
 */
public class StaffAgent {
    private Long staffAgentId;    // '自增长主键',
    private String staffCode;      // '员工工号',
    private String telephone;       // '员工电话',
    private String email;           // '员工邮箱',

    private String realName;       // '员工真实姓名',
    private String loginPwd;       // '登录密码',
    private Integer roleId;        // '员工隶属角色',
    private Short staffStatus;     // '审核状态 0=未审核 / 1=审核通过 / 2=审核拒绝',

    public Long getStaffAgentId() {
        return staffAgentId;
    }

    public void setStaffAgentId(Long staffAgentId) {
        this.staffAgentId = staffAgentId;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Short getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Short staffStatus) {
        this.staffStatus = staffStatus;
    }

}