package com.comit.realestate.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.realestate.bean.RealestateBean;
import com.comit.realestate.service.RealestateService;

import ch.qos.logback.classic.Logger;

@Controller
public class RealestateController {
	
	 private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	 
	 @Autowired
	 RealestateService realstateService;

	@GetMapping("/")
	public String index() {
		logger.debug("Landing Page");
		return "index";
	}
	@GetMapping("/list")
	public String list() {
		logger.debug("Landing Page");
		return "list";
	}
	//public ModelAndView list() {
      //  logger.debug("Listing Users");
        
        //List<RealestateBean> properties = this.listProperties();
        
		//return new ModelAndView("list","properties",properties);
//	}
//	private List<RealestateBean> listProperties() {
		// TODO Auto-generated method stub
//		return this.listProperties();
	//}
	
	
	
	
}
