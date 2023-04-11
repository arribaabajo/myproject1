package com.multi.mvc300;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("delete2.multi")
	public void delete(BbsVO bag) {

		System.out.println("delete요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.delete(bag);
	}
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {

		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
}