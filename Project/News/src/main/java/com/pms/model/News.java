package com.pms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class News {
	
	@Id
	private int news_id;
	private Date date1;
	private String news;
	private String events;
	
	public News() {
		super();
	}

	public News(int news_id,Date date1, String news, String events) {
		super();
		this.date1 = date1;
		this.news = news;
		this.events = events;
	}
	

	public int getNews_id() {
		return news_id;
	}

	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getEvents() {
		return events;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "News_Events [news_id=" + news_id + ", date1=" + date1 + ", news=" + news + ", events=" + events + "]";
	}
	
	

}