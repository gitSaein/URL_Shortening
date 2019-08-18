package com.saein.URL_Shortening;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.saein.URL_Shortening.dao.UrlRepository;
import com.saein.URL_Shortening.vo.Url;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlRepositoryTest {
	
	@Autowired
	UrlRepository urlRepository;
	
	@Test
	public void testUrlRepository() {
		Url url = new Url();
		url.setOriginUrl("origin");
		url.setShortUrl("shorturl");
		urlRepository.save(url);
		assertEquals(1, urlRepository.count());
		
	}

}
