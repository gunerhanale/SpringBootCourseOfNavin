package com.ebubekir.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ebubekir.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	List<Alien> findByAnameOrderByAidDesc(String aname);  //Query DSL (Domain Specific Language)
	
	@Query("from Alien where Aname = :name")
	List<Alien> find(@Param("name") String aname);

}
