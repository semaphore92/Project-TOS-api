package com.tos.toswpapi.repository;

import com.tos.toswpapi.vo.TestVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepositoty extends JpaRepository<TestVo, String> {

    public List<TestVo> findByUserId(String userId);
}