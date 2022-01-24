package com.xworkz.website;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteTestQuery {

	public static void main(String[] args) {
		
		WebsiteDAO websiteDAO= new WebsiteDAOImpl();
//		WebsiteEntity entity= websiteDAO.getByNameGoogle();
//		System.out.println(entity);
//		
		WebsiteEntity entity1=websiteDAO.getByLikeUrl();
		System.out.println(entity1);
//		
//		WebsiteEntity entity2= websiteDAO.getMaxBySince();
//		System.out.println(entity2);
//		
//		WebsiteEntity entity3= websiteDAO.getMinBySince();
//		System.out.println(entity3);
//		
//		WebsiteEntity entity4= websiteDAO.getSecondMinSince();
//		System.out.println(entity4);
//		
//		WebsiteEntity entity5= websiteDAO.getSecondMaxBySince();
//		System.out.println(entity5);



	}

}
