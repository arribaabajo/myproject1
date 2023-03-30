package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
		System.out.println(bag);
		System.out.println("로그인 요청됨");
		int result = dao.login(bag);
		if(result == 1) {
			return "ok";
		}else {
			return "no";
		}
	}
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("인서트 요청됨");
		System.out.println(bag);
		dao.insert(bag);
	}
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id, Model model) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
		
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
