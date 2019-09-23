package com.shorturl.genererateurl.controller;

import com.shorturl.genererateurl.Entity.Url;
import com.shorturl.genererateurl.services.UrlService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {


    private UrlService urlService;



    public void shortenUrl(@RequestBody Url  url) {
        urlService.shortenUrl(url);
    }



}
