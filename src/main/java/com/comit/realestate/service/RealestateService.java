package com.comit.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.realestate.bean.RealestateBean;
import com.comit.realestate.dao.RealestateDao;

@Service
public class RealestateService {

	@Autowired
	RealestateDao realstateDao;
	
	public List<RealestateBean> listProperties() {

		List<RealestateBean> properties = this.realstateDao.listProperties();
		
		return properties;
	}
}
