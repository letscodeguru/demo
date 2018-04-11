package com.mywork.service.demo.services.impl;

import org.springframework.stereotype.Service;

import com.mywork.service.demo.services.NewsFetchService;

@Service
public class NewsFetchServiceImpl implements NewsFetchService {

	@Override
	public String latestNews() {
		return "This is latest news.";
	}

}
