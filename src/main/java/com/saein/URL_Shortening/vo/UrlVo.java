package com.saein.URL_Shortening.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UrlVo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String originUrl;
	
	@Column(length = 8)
	private String shortUrl;
	
	private Boolean is;
	
	public UrlVo(String originUrl,String shortUrl) {
		this.originUrl = originUrl;
		this.shortUrl = shortUrl;
	}
	
}
