package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AirportController {
@Autowired
AirportDAO dao;

	@RequestMapping("one4.multi")
	public void one(String code, Model model) {
		System.out.println("one요청됨.");
		System.out.println(code);
		AirportVO bag = dao.one(code);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list3")
	public void list(Model model) {
		ArrayList<AirportVO> list = dao.list();
		model.addAttribute("list", list);
		
	}
}