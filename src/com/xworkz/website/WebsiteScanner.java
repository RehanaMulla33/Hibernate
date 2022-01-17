package com.xworkz.website;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteScanner {

	public static void main(String[] args) {
		
		WebsiteEntity entity1 = new WebsiteEntity("KVS Sangathan","https://www.kvs.org.in",".com","Govt PSU");
		WebsiteEntity entity2 = new WebsiteEntity("KPSC","https:/kpsc.kar.nic.in",".com","Govt Karnata");
		WebsiteEntity entity3 = new WebsiteEntity("KEA Sangathan","https://www.kea.in",".in","Govt Edu");
		WebsiteEntity entity4 = new WebsiteEntity("Yahoo","https://www.yahoo.com",".com","Mark Rowan ");
		WebsiteEntity entity5 = new WebsiteEntity("Gmail ","https://www.gmail.com",".com","Sunadr Pichai ");
		WebsiteEntity entity6 = new WebsiteEntity("rediffmail Sangathan","https://www.rediffmail.com",".com","Ajit Balakrishnan");
		WebsiteEntity entity7 = new WebsiteEntity("facebook ","https://www.facebook.com",".com","Mark Zuckerberg");
		WebsiteEntity entity8 = new WebsiteEntity("twitter ","https://www.twitter.com",".com","Parag Agarwal ");
		WebsiteEntity entity9 = new WebsiteEntity("Tik Tok ","https://www.tiktok.com",".com","Zhang Yiming ");
		WebsiteEntity entity10 = new WebsiteEntity("Instagram ","https://www.instagram.com",".com","Mark zuberg ");
		WebsiteEntity entity11 = new WebsiteEntity("Amazon ","https://www.amazon.in",".in","Jeff Bezos ");
		WebsiteEntity entity12 = new WebsiteEntity("Office ","https://www.kvs.org.in",".com","Brad Smith  ");
		WebsiteEntity entity13 = new WebsiteEntity("wikipedia ","https://en.wikipediag.org.",".org","Jimmey walles ");
		WebsiteEntity entity14 = new WebsiteEntity("whatsapp ","https://www.whatsapp.com",".com","Meta-Mark zuberg ");
		WebsiteEntity entity15 = new WebsiteEntity("discord ","https://discord.com",".com","Jason Citron ");
		WebsiteEntity entity16 = new WebsiteEntity("Live  ","https://Livenow.com",".com","Mahesh Motewar ");
		WebsiteEntity entity17 = new WebsiteEntity("baidu ","https://www.baidu.com",".com","Robin li ");
		WebsiteEntity entity18 = new WebsiteEntity("zoom ","https://www.zoom.us",".us","Eric Yuan ");
		WebsiteEntity entity19 = new WebsiteEntity("twitch ","https://www.twitch.tv",".tv","Emmett Shear ");
		WebsiteEntity entity20 = new WebsiteEntity("flipcart ","https://www.flipcart.com",".com","Kalyan Krishnamurthy");
		WebsiteEntity entity21 = new WebsiteEntity("ok ","https://www.ok.gov.in",".gov","Joginder Singh Dalal ");
		WebsiteEntity entity22 = new WebsiteEntity("BBC ","https://www.bbc.com",".com","John Reith  ");
		
		 WebsiteDAO dao = new WebsiteDAOImpl();
		//dao.put(entity1);
		 //dao.put(entity2);
		//dao.put(entity3);
		dao.put(entity4);
		dao.put(entity5);
		dao.put(entity6);
		dao.put(entity7);
		dao.put(entity8);
		dao.put(entity9);
		dao.put(entity10);
		dao.put(entity11);
		dao.put(entity12);
		dao.put(entity13);
		dao.put(entity14);
		dao.put(entity15);
		dao.put(entity16);
		dao.put(entity17);
		dao.put(entity18);
		dao.put(entity19);
		dao.put(entity20);
		dao.put(entity21);
		dao.put(entity22);

	}

}
