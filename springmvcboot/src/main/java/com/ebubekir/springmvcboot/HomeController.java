package com.ebubekir.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebubekir.springmvcboot.model.Alien;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
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

	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		int num3 = i + j;
		m.addAttribute("num3", num3);

		return "result";
	}

	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a) {

		return "result";
	}

}