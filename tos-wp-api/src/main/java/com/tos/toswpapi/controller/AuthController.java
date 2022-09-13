package com.tos.toswpapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @GetMapping({"/google/self/url"})
    public Map<String,Object> googleLocalUrl(
            HttpServletRequest request,
            HttpServletResponse response
    ){

        System.out.println("googleLocalUrl Start");

        return null;
    }
}
