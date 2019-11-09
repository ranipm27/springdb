package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	
	@Autowired
	private XX_IBMProjectRepository xxibmrepo;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<XXIBM_Project> getAllProjects() {
		// This returns a JSON or XML with the users
		return xxibmrepo.findAll();
	}
	

}
