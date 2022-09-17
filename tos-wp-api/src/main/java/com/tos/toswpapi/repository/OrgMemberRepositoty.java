package com.tos.toswpapi.repository;

import com.tos.toswpapi.vo.MemberVo;
import com.tos.toswpapi.vo.OrgMemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrgMemberRepositoty extends JpaRepository<OrgMemberVo, String> {
}