package com.tos.toswpapi.repository;

import com.tos.toswpapi.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MemberRepositoty extends JpaRepository<MemberVo, String> {

    public List<MemberVo> findByMvUserId(String userId);
}