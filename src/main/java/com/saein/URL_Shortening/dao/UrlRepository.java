/**
 * 
 */
package com.saein.URL_Shortening.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saein.URL_Shortening.vo.Url;

/**
 * @author saein
 *
 */
@Repository
public interface UrlRepository extends CrudRepository<Url, Integer>{
	Url findByOriginUrl(String originUrl);
}
