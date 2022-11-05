package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	/*
	public void index() {
		System.out.println("인덱스입니다.");
		// console에 출력되긴 해도 권한은 was가 가지고 있다.
	}
	*/

	@RequestMapping("/main")
	@ResponseBody
	public String index() {
		return "인덱스입니다.";
		// 이렇게 하면 화면에서 볼 수 있음
	}
}
