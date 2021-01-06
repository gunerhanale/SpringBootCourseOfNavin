package com.ebubekir.springmvcboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebubekir.springmvcboot.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Ebubekir");
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping(value = "addAlien")
	public String addAlien(@ModelAttribute Alien a) {
		
		repo.save(a);
		return "result";
	}

	@GetMapping("getAliens")
	public String getAliens(Model m) {
	
		List<Alien> aliens = repo.findAll();
		m.addAttribute("result", aliens);
		
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) {
	
		Alien alien = repo.getOne(aid);
		m.addAttribute("result", alien);
		
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m) {
	
		List<Alien>  alien = repo.find(aname);
		m.addAttribute("result", alien);
		
		return "showAliens";
	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1")int i ,@RequestParam("num2") int j)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int num3 = i + j;
//		
//		mv.addObject("num3",num3);
//		
//		return  mv;
//		
//	}

//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
//		int num3 = i + j;
//		m.addAttribute("num3", num3);
//
//		return "result";
//	}

}