package com.tos.toswpapi.service;

import com.tos.toswpapi.repository.MemberRepositoty;
import com.tos.toswpapi.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    MemberRepositoty memberRepositoty;

    public List<MemberVo> selectTestId(String id){

        List<MemberVo> testList = new ArrayList<>();
        memberRepositoty.findAll().forEach(e -> testList.add(e));

        return testList;
    }
}
