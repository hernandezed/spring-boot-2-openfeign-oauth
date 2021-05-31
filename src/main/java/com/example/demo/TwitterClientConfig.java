package com.example.demo;


import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;

@RequiredArgsConstructor
public class TwitterClientConfig {

    private final OAuth2Provider oauth2Provider;
    private final String TWITTERAUTH_SERVER_NAME = "twitter-auth";

    @Bean
    public RequestInterceptor twitterInterceptor() {
        return (requestTemplate) ->
                requestTemplate.header(
                        HttpHeaders.AUTHORIZATION, oauth2Provider.getAuthenticationToken(TWITTERAUTH_SERVER_NAME));
    }
}
