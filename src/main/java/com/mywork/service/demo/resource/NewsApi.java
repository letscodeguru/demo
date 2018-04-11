package com.mywork.service.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mywork.service.demo.services.NewsFetchService;

@RestController
@RequestMapping(path = "/news")
public class NewsApi {

	@Autowired
	NewsFetchService newsFetchService;
	
	@GetMapping(path = "latest")
	public String latestNews() {
		return newsFetchService.latestNews();
	}	
}
