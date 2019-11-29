package com.pms.dao;

import com.pms.model.News;

public interface NewsDAO {

	public boolean addNews(News news);

	public boolean deleteNews(int newsId);

	public News displayNews(int newsId);

}
