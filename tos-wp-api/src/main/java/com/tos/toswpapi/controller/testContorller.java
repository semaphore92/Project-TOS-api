package com.tos.toswpapi.controller;

import com.tos.toswpapi.service.TestService;
import com.tos.toswpapi.vo.MemberVo;
import com.tos.toswpapi.vo.OrgMemberVo;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.lang.reflect.Member;
import java.util.List;

@RestController
@RequestMapping("api")
@Transactional
public class testContorller {

    @Autowired
    TestService testService;

    @PersistenceContext
    private EntityManager em;

    @GetMapping(value="/member/info/{userId}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MemberVo>> getMemberInfo(@PathVariable("userId") String userId){

        System.out.println("getMemberInfo Start");
        //List<MemberVo> testList = testService.selectTestId(userId);
        //return new ResponseEntity<List<MemberVo>>(testList,HttpStatus.OK);

        return null;
    }
    @GetMapping(value="/member/info/join/{userId}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MemberVo>> getMemberJoinInfo(@PathVariable("userId") String userId){

        System.out.println("getMemberJoinInfo Start");

        OrgMemberVo orgMemberVo = new OrgMemberVo();
        orgMemberVo.setOmvUserId("swheo");
        em.persist(orgMemberVo);

        MemberVo memberVo = new MemberVo();
        memberVo.setMvUserId("swheo");
        memberVo.addOrgMember(orgMemberVo);
        em.persist(memberVo);


        return null;

    }




}
