package com.tos.toswpapi.controller;

import com.tos.toswpapi.service.GoogleAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    GoogleAuthService googleAuthService;


    @GetMapping({"/google/self/url"})
    public Map<String,Object> googleLocalUrl(
            HttpServletRequest request,
            HttpServletResponse response
    ){

        System.out.println("googleLocalUrl Start");
        String url = googleAuthService.getAuthURL();

        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("url",url);

        return resultMap;
    }
}
