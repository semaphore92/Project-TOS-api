package com.tos.toswpapi.controller;

import com.tos.toswpapi.service.TestService;
import com.tos.toswpapi.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class testContorller {

    @Autowired
    TestService testService;

    @GetMapping(value="/member/info/{userId}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<TestVo>> getMemberInfo(@PathVariable("userId") String userId){

        System.out.println("getMemberInfo Start");
        List<TestVo> testList = testService.selectTestId(userId);
        return new ResponseEntity<List<TestVo>>(testList,HttpStatus.OK);
    }



}
