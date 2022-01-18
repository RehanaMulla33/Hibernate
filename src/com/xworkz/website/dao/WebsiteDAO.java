package com.xworkz.website.dao;

import com.xworkz.website.entity.WebsiteEntity;

public interface WebsiteDAO {
	void put(WebsiteEntity entity);
	WebsiteEntity getByNameGmail();
	WebsiteEntity getByLikeUrla();
	WebsiteEntity getByMinSince();
	WebsiteEntity getByMaxSince();
	WebsiteEntity getBySecondMinSince();
	WebsiteEntity getBySecondMaxSince();
	

}
