package com.tos.toswpapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@PropertySource("classpath:secret.properties")

@Service
public class GoogleAuthService {

    @Value("${google.client.auth.endpoint}")
    private String googleClientAuthEndpoint;

    @Value("${google.client.auth.scope}")
    private String googleClienAuthScope;

    @Value("${google.client.auth.redirect}")
    private String googleClientAuthRedirect;

    @Value("${google.client.id}")
    private String googleClientId;

    public String getAuthURL(){

        StringBuffer sb = new StringBuffer();
        sb.append(googleClientAuthEndpoint + "?");
        sb.append("scope=" + googleClienAuthScope + "&");
        sb.append("include_granted_scopes=true&");
        sb.append("response_type=code&");
        sb.append("access_type=offline&");
        sb.append("prompt=consent&");
        sb.append("state=member");

        sb.append("&");

        sb.append("redirect_uri=" + googleClientAuthRedirect + "&");
        sb.append("client_id=" + googleClientId);

        return sb.toString();
    }
}
