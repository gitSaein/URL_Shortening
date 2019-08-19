package com.saein.URL_Shortening.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "URL")
public class Url {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer key;
	@Column(length=2000)
	private String originUrl;
	private String shortUrl;
}
