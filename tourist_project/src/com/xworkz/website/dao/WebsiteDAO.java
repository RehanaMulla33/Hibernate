package com.xworkz.website.dao;

import java.util.List;

import com.xworkz.website.entity.WebsiteEntity;

public interface WebsiteDAO {

	void save(List<WebsiteEntity> webSiteEntity);

	WebsiteEntity getByNameGoogle();

	WebsiteEntity getByLikeUrl();

	WebsiteEntity getMaxBySince();

	WebsiteEntity getMinBySince();

	WebsiteEntity getSecondMinSince();

	WebsiteEntity getSecondMaxBySince();

}
