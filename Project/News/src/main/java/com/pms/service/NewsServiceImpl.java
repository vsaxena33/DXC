package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.model.News;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	NewsService newsService;

	public boolean addNews(News news) {
		System.out.println("inside news service: " + news);
		newsService.addNews(news);
		return false;
	}

	public boolean deleteNews(int newsId) {
		return newsService.deleteNews(newsId);
	}

	public News displayNews(int newsId) {
		return newsService.displayNews(newsId);
	}

}
