package com.shorturl.genererateurl.services;

import com.shorturl.genererateurl.Entity.Url;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlService {

    private List<Url> urlList=new ArrayList<>();

    public void shortenUrl(Url  url) {
        for (int i=0;i<urlList.size();i++) {
            Url u=urlList.get(i);
            if(u.getLongUrl().equals(url.getLongUrl())) {
                return;
            }
            else urlList.add(i,url);
        }
        return;
    }

}
