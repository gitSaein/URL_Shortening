/**
 * 
 */
package com.saein.URL_Shortening.dao;

import org.springframework.data.repository.CrudRepository;

import com.saein.URL_Shortening.vo.UrlVo;

/**
 * @author saein
 *
 */
public interface UrlRepository extends CrudRepository<UrlVo, Long>{

	@Override
	default <S extends UrlVo> S save(S entity) {
		return null;
	}

	@Override
	default boolean existsById(Long id) {
		return false;
	}
	
}
