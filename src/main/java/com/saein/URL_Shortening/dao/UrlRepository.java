/**
 * 
 */
package com.saein.URL_Shortening.dao;

import org.springframework.data.repository.CrudRepository;

import com.saein.URL_Shortening.vo.Url;

/**
 * @author saein
 *
 */
public interface UrlRepository extends CrudRepository<Url, Long>{
}
