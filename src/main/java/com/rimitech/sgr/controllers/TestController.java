package com.rimitech.sgr.controllers;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rimitech.sgr.dao.StructureRepository;
import com.rimitech.sgr.models.Equipement;
import com.rimitech.sgr.services.EquipementServiceImpl;



@RestController
public class TestController {

	
	@Autowired
	  EquipementServiceImpl	repo;
	@Autowired
	StructureRepository srepo;
	@Autowired
	 MessageSource messageSource;
	
		@RequestMapping(value="/test",method=RequestMethod.GET)
	    public	ModelAndView index(ModelAndView	mv) 
    {
			
		//	List<Equipement> qs=repo.findByEta(srepo.findOne((long) 1), "D");
			System.out.print(messageSource.getMessage("hello.content", null, Locale.US));
	    	return	new ModelAndView("test");
	    }
		
		

}
