package com.saein.URL_Shortening.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "URL")
public class Url {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer key;
	private String originUrl;
	private String shortUrl;
}
