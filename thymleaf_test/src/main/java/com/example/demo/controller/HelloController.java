package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.vo.MemberVO;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public void hello(Model model) {
		//프로젝트 생성시 thymeleaf를 설정하면 컨트롤러에서 요청한 서비스명이 /hello
		//라고 설정한 결과를 보여주기 위한 view페이지를 jsp요구x
		//hello.html을 요구함 -> html을 templates라는 폴더에서 찾음
		//html사용할 데이터를 상태유지하는 것은 jsp로 이동할 때처럼
		//Model에 상태 유지
		System.out.println("컨트롤러 동작");
		String name = "홍길동";
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("사과");
		list.add("수박");
		list.add("포도");
		model.addAttribute("name",name);
		model.addAttribute("list",list);
		
		ArrayList<MemberVO> memberlist = new ArrayList<MemberVO>();
		memberlist.add(new MemberVO(1,"홍길동", 20,"서울"));
		memberlist.add(new MemberVO(2,"이순신", 30,"인천"));
		memberlist.add(new MemberVO(3,"유관순", 40,"부산"));
		
		model.addAttribute("memberlist",memberlist);
	}
}
