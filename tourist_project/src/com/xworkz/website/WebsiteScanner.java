package com.xworkz.website;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;
import com.xworkz.website.dao.WebsiteDAO;

public class WebsiteScanner {

	public static void main(String[] args) {
		
		List<WebsiteEntity> list= new ArrayList<WebsiteEntity>();
		list.add(new WebsiteEntity("google", "software","larry page", 1945, "www.google.com")); 
		list.add(new WebsiteEntity("facebook", "socail networking ", "mark zukerberg", 2010, "www.facebook.com"));
		list.add(new WebsiteEntity("blogger", "content manager", "Evan Williams", 1999, "www.blogger.com"));
		list.add(new WebsiteEntity("youtube", "Entertainment", "san matio", 2005, "www.youtube.com"));
		list.add(new WebsiteEntity("whatsapp", "socail site", "Jan Koum", 2014, "wwww.whatsapp.com"));
		list.add(new WebsiteEntity("apple", "electronic", "steve jobs",1976, "wwww.apple.com"));
		list.add(new WebsiteEntity("microsoft", "e-commerece","bill gates", 1995, "www.microsoft.com"));
		list.add(new WebsiteEntity("adobe", "software", "Charles Geschke",1982 , "www.adobe.com"));
		list.add(new WebsiteEntity("imdb", "internet movie database", "Col Needham",1998, "www.imdb.com"));
		list.add(new WebsiteEntity("bbc","News broadCasting", "HM Government", 1992, "www.bbc.com"));
		list.add(new WebsiteEntity("yahoo", "search engine", "Jerry Yang", 1994, "www.yahoo.com"));
		list.add(new WebsiteEntity("gmail", "digital message exchange", "Paul Buchheit", 2001,"www.gmail.com"));
		list.add(new WebsiteEntity("rediff", "web portal", "Ajit Balakrishnan", 1996, "www.rediff.com"));
		list.add(new WebsiteEntity("india Times","newspaper", "angad bhatia", 1994, "www.indiatimes.com"));
		list.add(new WebsiteEntity("Timeas Of India", "newspaper", "Ramkrishna Dalmia",1978 ,"www.timesofindia.com"));
		list.add(new WebsiteEntity("telegram", "web appliction", "Nikolai and Pavel Durov", 2013,"www.telegram.org"));
		list.add(new WebsiteEntity("99Acers", "web portal", "Sanjeev Bikhchandani", 2005, "www.99acers.com"));
		list.add(new WebsiteEntity("pinterest", "social media service", " Ben Silbermann", 2009, "www.pinterest.com"));
		list.add(new WebsiteEntity("flipkart", "e-commerece", "sachin bansal", 2007, "www.flipkart.com"));
		list.add(new WebsiteEntity("amazonss", "e-commerece", "Jeff Bezos", 1994, "www.amazone.com"));
		list.add(new WebsiteEntity("netflix", "entertainment", "Reed Hastings", 1997, "www.netflix.com"));
		list.add(new WebsiteEntity("wikipedia", "content", "Jimmy Wales", 2000, "www.wiwkipedida.com"));
		list.add(new WebsiteEntity("skype", "software", "Niklas Zennstrom", 2003, "www.skype.com"));
		list.add(new WebsiteEntity("disney", "entertainment", "walt disney", 1923, "www.disney.com"));
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		//dao.save(list);
		
		
		}


	}


