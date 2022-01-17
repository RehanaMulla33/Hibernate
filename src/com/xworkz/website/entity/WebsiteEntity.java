package com.xworkz.website.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "website_detail")

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
	public WebsiteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebsiteEntity(String name, String url, String domain, String owner) {
		super();
		this.name = name;
		this.url = url;
		this.domain = domain;
		this.owner = owner;
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


	
	