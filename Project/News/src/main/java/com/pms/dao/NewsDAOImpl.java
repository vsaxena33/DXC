package com.pms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.pms.model.News;

@Repository
public class NewsDAOImpl implements NewsDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;

	public boolean addNews(News news) {
		System.out.println("added in dao" + news);
		mongoTemplate.save(news);
		return false;
	}

	public boolean deleteNews(int newsId) {
		News news = new News();
		news.setNews_id(newsId);
		WriteResult writeResult = mongoTemplate.remove(news);
		System.out.println(writeResult);
		int rowsAffected = writeResult.getN();
		if (rowsAffected == 0)
			return false;
		else
			return true;
	}

	public News displayNews(int newsId) {
		return mongoTemplate.findById(newsId, News.class, "news");
	}

}
