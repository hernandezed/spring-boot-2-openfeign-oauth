package com.example.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "twitter", url = "${twitter.service.url}", configuration = TwitterClientConfig.class)
interface TwitterClient {
    @RequestMapping(value = "/search/tweets.json", method = RequestMethod.GET)
    TwitterSearch search(@RequestParam("q") String q);
}
