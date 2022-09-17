package com.tos.toswpapi.vo;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="test_member")
public class MemberVo {

    @Id
    @Column(name="user_id")
    private String mvUserId;

    @Column(name="user_name")
    private String mvUserName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="member_org",
                    joinColumns = @JoinColumn(name="mvUserId"),
                    inverseJoinColumns = @JoinColumn(name="mvUserName"))
    private List<OrgMemberVo> orgMemberVoList = new ArrayList<>();

    public void addOrgMember(OrgMemberVo orgMemberVo){
        orgMemberVoList.add(orgMemberVo);
    }


    public String getMvUserId() {
        return mvUserId;
    }

    public void setMvUserId(String mvUserId) {
        this.mvUserId = mvUserId;
    }

    public String getMvUserName() {
        return mvUserName;
    }

    public void setMvUserName(String mvUserName) {
        this.mvUserName = mvUserName;
    }

    public List<OrgMemberVo> getOrgMemberVoList() {
        return orgMemberVoList;
    }

    public void setOrgMemberVoList(List<OrgMemberVo> orgMemberVoList) {
        this.orgMemberVoList = orgMemberVoList;
    }


}
