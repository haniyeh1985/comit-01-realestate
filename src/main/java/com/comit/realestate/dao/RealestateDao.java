package com.comit.realestate.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.comit.realestate.bean.RealestateBean;

import ch.qos.logback.classic.pattern.Util;

@Repository
public class RealestateDao {

	List<RealestateBean> properties;
	public  RealestateDao() {
		this.properties= new ArrayList<RealestateBean>();
		RealestateBean property=new RealestateBean(1, "house", 80,Util.parseDate(""), 2, 2, "yes", "yes", "yes", "yes", "A");
		
		properties.add(new RealestateBean(1,"house",70,Util.parseDate("19-02-04"),2,2,"A","A","A","A","A"));
	}
public List<RealestateBean> listUsers() {
		
		return this.properties;
	}
public List<RealestateBean> listProperties() {
	// TODO Auto-generated method stub
	return this.properties;
}
}
