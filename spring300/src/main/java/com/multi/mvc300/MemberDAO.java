package com.multi.mvc300;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게!라고 설정해야함.
//2가지방법을 할 수 있음.
//어노테이션(표시)방법, XML방법
@Component
public class MemberDAO { 
//		return result;
//	}
//
//	public ArrayList<MemberVO> list() {
//		return list;
//	}
//
//	
//	public MemberVO one(String id) {
//		return bag;
//	}
//
//	public int delete(String id) {
//		return result;
//	}
//
//
//	public int update(MemberVO bag) {
//		return result;
//	}
	
	@Autowired
	SqlSessionTemplate my;
	public int insert(MemberVO bag) {
	int result = my.insert("member.create", bag);
		return result;
	}
}
