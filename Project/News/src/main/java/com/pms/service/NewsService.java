package com.pms.service;

import com.pms.model.News;

public interface NewsService {

	public boolean addNews(News news);

	public boolean deleteNews(int newsId);

	public News displayNews(int newsId);

}
