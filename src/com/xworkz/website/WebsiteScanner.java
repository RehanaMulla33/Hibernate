package com.xworkz.website;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteScanner {

	public static void main(String[] args) {

		//WebsiteEntity entity1 = new WebsiteEntity("KVS Sangathan", "https://www.kvs.org.in", ".com", "Govt PSU",1970);
		//WebsiteEntity entity2 = new WebsiteEntity("KPSC", "https:/kpsc.kar.nic.in", ".com", "Govt Karnata",1990);
		//WebsiteEntity entity3 = new WebsiteEntity("KEA Sangathan", "https://www.kea.in", ".in", "Govt Edu",2000);
		//WebsiteEntity entity4 = new WebsiteEntity("Yahoo", "https://www.yahoo.com", ".com", "Mark Rowan ",1999);
		//WebsiteEntity entity5 = new WebsiteEntity("Gmail ", "https://www.gmail.com", ".com", "Sunadr Pichai ",1976);
		//WebsiteEntity entity6 = new WebsiteEntity("rediffmail Sangathan", "https://www.rediffmail.com", ".com","Ajit Balakrishnan",1997);
		//WebsiteEntity entity7 = new WebsiteEntity("facebook ", "https://www.facebook.com", ".com", "Mark Zuckerberg",2005);
		//WebsiteEntity entity8 = new WebsiteEntity("twitter ", "https://www.twitter.com", ".com", "Parag Agarwal ",2000);
		//WebsiteEntity entity9 = new WebsiteEntity("Tik Tok ", "https://www.tiktok.com", ".com", "Zhang Yiming ",2005);
		//WebsiteEntity entity10 = new WebsiteEntity("Instagram ", "https://www.instagram.com", ".com", "Mark zuberg ",1998);
		//WebsiteEntity entity11 = new WebsiteEntity("Amazon ", "https://www.amazon.in", ".in", "Jeff Bezos ",1992);
		//WebsiteEntity entity12 = new WebsiteEntity("Office ", "https://www.kvs.org.in", ".com", "Brad Smith  ",2003);
		//WebsiteEntity entity13 = new WebsiteEntity("wikipedia ", "https://en.wikipediag.org.", ".org","Jimmey walles ",2009);
		//WebsiteEntity entity14 = new WebsiteEntity("whatsapp ", "https://www.whatsapp.com", ".com","Meta-Mark zuberg ",2013);
		//WebsiteEntity entity15 = new WebsiteEntity("discord ", "https://discord.com", ".com", "Jason Citron ",2008);
		//WebsiteEntity entity16 = new WebsiteEntity("Live  ", "https://Livenow.com", ".com", "Mahesh Motewar ",2009);
		//WebsiteEntity entity17 = new WebsiteEntity("baidu ", "https://www.baidu.com", ".com", "Robin li ",2010);
		//WebsiteEntity entity18 = new WebsiteEntity("zoom ", "https://www.zoom.us", ".us", "Eric Yuan ",2011);
		//WebsiteEntity entity19 = new WebsiteEntity("twitch ", "https://www.twitch.tv", ".tv", "Emmett Shear ",2012);
		//WebsiteEntity entity20 = new WebsiteEntity("flipcart ", "https://www.flipcart.com", ".com","Kalyan Krishnamurthy",2013);
		//WebsiteEntity entity21 = new WebsiteEntity("ok ", "https://www.ok.gov.in", ".gov", "Joginder Singh Dalal ",2014);
		//WebsiteEntity entity22 = new WebsiteEntity("BBC ", "https://www.bbc.com", ".com", "John Reith",2015);

		//WebsiteDAO dao1 = new WebsiteDAOImpl();
		//WebsiteEntity en=dao1.getByNameGmail();
		//System.out.println(en);
		

		//WebsiteDAO dao2 = new WebsiteDAOImpl();
		//WebsiteEntity en2=dao2.getByLikeUrla();
		//System.out.println(en2);
		

		WebsiteDAO dao3 = new WebsiteDAOImpl();
		WebsiteEntity en3=dao3.getByMinSince();
		System.out.println(en3);
		

		//WebsiteDAO dao4 = new WebsiteDAOImpl();
		//WebsiteEntity en4=dao4.getByMaxSince();
		//System.out.println(en4);
		
		//WebsiteDAO dao5 = new WebsiteDAOImpl();
		//WebsiteEntity en5=dao5.getBySecondMaxSince();
		//System.out.println(en5);
		
		//WebsiteDAO dao6 = new WebsiteDAOImpl();
		//WebsiteEntity en6=dao6.getBySecondMinSince();
		//System.out.println(en6);
		
		
		//dao.put(entity1);
		//dao.put(entity2);
		//dao.put(entity3);
		//dao.put(entity4);
		//dao.put(entity5);
		//dao.put(entity6);
		//dao.put(entity7);
		//dao.put(entity8);
		//dao.put(entity9);
		//dao.put(entity10);
		//dao.put(entity11);
		//dao.put(entity12);
		//dao.put(entity13);
		//dao.put(entity14);
		//dao.put(entity15);
		//dao.put(entity16);
		//dao.put(entity17);
		//dao.put(entity18);
		//dao.put(entity19);
		//dao.put(entity20);
		//dao.put(entity21);
		//dao.put(entity22);

	}

}
