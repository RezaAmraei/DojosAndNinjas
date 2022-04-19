package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojosService;
import com.codingdojo.dojosandninjas.services.NinjasService;

@Controller
public class MainController {
	@Autowired
	DojosService dojosService;
	@Autowired
	NinjasService ninjasService;
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/new/dojo")
	public String newDojo( @ModelAttribute("newDojo") Dojo dojo) {
		return "createdojo.jsp";
	}
	
	@PostMapping("/creating/dojo")
	public String processingDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "createdojo.jsp";	
		}else {
			dojosService.createDojo(dojo);
			return "redirect:/view/dojo";
		}
	}
	@RequestMapping("/new/ninja")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojosService.findAllNDojos();
		model.addAttribute("allDojos", allDojos);
		return "createninja.jsp";
	}
	
	@PostMapping("/creating/ninja")
	public String creatingNinja(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()){
			List<Dojo> allDojos = dojosService.findAllNDojos();
			model.addAttribute("allDojos", allDojos);
			return "createninja.jsp";
			
		}else {
			ninjasService.createNinja(ninja);
			return "redirect:/";
		}
	}
	@RequestMapping("/view/dojo")
	public String viewDojo(Model model) {
		List<Dojo> allDojos = dojosService.findAllNDojos();
		model.addAttribute("allDojos", allDojos );
		return "showdojo.jsp";
	}
	@RequestMapping("/dojo/{id}")
	public String dojoandninjas(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojosService.findDojoById(id);
		model.addAttribute("dojo", dojo);
		return "dojoandninjas.jsp";
	}
}
