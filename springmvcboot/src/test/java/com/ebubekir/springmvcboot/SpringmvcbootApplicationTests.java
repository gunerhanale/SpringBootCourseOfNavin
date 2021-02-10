package com.ebubekir.springmvcboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ebubekir.springmvcboot.model.Alien;

@SpringBootTest
class SpringmvcbootApplicationTests {
	
	@Autowired
	AlienRepo repo;
	
	@Autowired
	AlienController alienController;
	
 
	@Test
	void contextLoads() {
		System.out.println("Tested AlienRepo method find: " + repo.find("Mina")); 
		System.out.println("Tested AlienRepo method findByAnameOrderByAidDesc: " + repo.findByAnameOrderByAidDesc("Mina"));
		
		System.out.println("Tested AlienController method getAliens: " + alienController.getAliens());
		System.out.println("Tested AlienController method getAlien: " + alienController.getAlien(101));
		System.out.println("Tested AlienController method addAlien: " + alienController.addAlien(new Alien(105, "Kemal Sekerci")));
		
	}

}
