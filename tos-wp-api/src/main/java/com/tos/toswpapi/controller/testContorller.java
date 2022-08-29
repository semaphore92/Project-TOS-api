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
@RequestMapping("test")
public class testContorller {

    @Autowired
    TestService testService;

    @GetMapping(value="/{userId}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<TestVo>> getTestInfo(@PathVariable("userId") String userId){
        List<TestVo> testList = testService.selectTestId(userId);
        return new ResponseEntity<List<TestVo>>(testList,HttpStatus.OK);
    }



}
