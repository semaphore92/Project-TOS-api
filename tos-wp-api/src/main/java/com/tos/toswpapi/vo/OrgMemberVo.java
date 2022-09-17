package com.tos.toswpapi.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="org_member_rel")
public class OrgMemberVo {

    @Id
    @Column(name="user_id")
    private String omvUserId;

    @Column(name="org_code")
    private String omOrgCode;

    public String getOmvUserId() {
        return omvUserId;
    }

    public void setOmvUserId(String omvUserId) {
        this.omvUserId = omvUserId;
    }

    public String getOmOrgCode() {
        return omOrgCode;
    }

    public void setOmOrgCode(String omOrgCode) {
        this.omOrgCode = omOrgCode;
    }


}
