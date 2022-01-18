package com.xworkz.website.entity;

import java.util.Objects;
import java.lang.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "website_detail")

@NamedQueries({
	@NamedQuery(name = "getByNameGmail", query = " from WebsiteEntity web where web.name='whatsapp'"),
	
	@NamedQuery(name="getByLikeUrla", query="from WebsiteEntity  where url like 'https://www.a%'"),
	
	@NamedQuery(name="getByMinSince", query="select id,name,url,owner,domain, since  from WebsiteEntity "
			+ "where since=(select min(since) from WebsiteEntity)"),
	
	@NamedQuery(name="getByMaxSince", query="select id,name,url,owner,domain, since  from WebsiteEntity"
			+ " where since=(select max(since) from WebsiteEntity)"),
	
	@NamedQuery(name = "getBySecondMinSince", query = " select min(since),name ,id, url,owner,domain from WebsiteEntity  "
			+ "where since != (select min(since) from WebsiteEntity)"),
	
	@NamedQuery(name = "getBySecondMaxSince", query = "select max(since),name ,id,url,owner,domain from WebsiteEntity "
			+ "where since != (select max(since) from WebsiteEntity )")
})
public class WebsiteEntity {
	@Id
	@Column (name="w_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="w_name")
	private String name;
	@Column (name="url")
	private String url;
	@Column (name="domain")
	private String domain;
	@Column (name="owner")
	private String owner;
	@Column (name="since")
	private int since;
	
	public WebsiteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		public WebsiteEntity(String name, String url, String domain, String owner, int since) {
		super();
		this.name = name;
		this.url = url;
		this.domain = domain;
		this.owner = owner;
		this.since = since;
	}
		
		


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getUrl() {
			return url;
		}


		public void setUrl(String url) {
			this.url = url;
		}


		public String getDomain() {
			return domain;
		}


		public void setDomain(String domain) {
			this.domain = domain;
		}


		public String getOwner() {
			return owner;
		}


		public void setOwner(String owner) {
			this.owner = owner;
		}


		public int getSince() {
			return since;
		}


		public void setSince(int since) {
			this.since = since;
		}


		@Override
	public int hashCode() {
		return Objects.hash(domain, id, name, owner, url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebsiteEntity other = (WebsiteEntity) obj;
		return Objects.equals(domain, other.domain) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner) && Objects.equals(url, other.url);
	}
	@Override
	public String toString() {
		return "WebsiteEntity [id=" + id + ", name=" + name + ", url=" + url + ", domain=" + domain + ", owner=" + owner
				+ "]";
	}
	
}


	
	