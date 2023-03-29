package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@Autowired
	BookDAO dao;
	
	@RequestMapping("one3.multi")
	public void book(String id, Model model) {
		BookVO bag = dao.one(id);
		model.addAttribute("bag",bag);
	}
}
