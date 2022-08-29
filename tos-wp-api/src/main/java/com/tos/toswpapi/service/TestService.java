package com.tos.toswpapi.service;

import com.tos.toswpapi.repository.TestRepositoty;
import com.tos.toswpapi.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    TestRepositoty testRepositoty;

    public List<TestVo> selectTestId(String id){

        List<TestVo> testList = new ArrayList<>();
        testRepositoty.findAll().forEach(e -> testList.add(e));

        return testList;
    }

}
