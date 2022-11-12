package com.board.pra;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;
import com.board.pra.question.QuestionService;

import lombok.RequiredArgsConstructor;

// URL Prefix
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class MainController {

	/*
	public void index() {
		System.out.println("인덱스입니다.");
		// console에 출력되긴 해도 권한은 was가 가지고 있다.
	}
	*/
	
	//private final QuestionRepository questionRepository;
	private final QuestionService questionService;

	@RequestMapping("/main")
	@ResponseBody
	public String index() {
		return "인덱스입니다.";
		// 이렇게 하면 화면에서 볼 수 있음
	}
	
	@RequestMapping(value = "/list")
	//@ResponseBody
	public String list(Model model) {
		
		//List<Question> questionList = this.questionRepository.findAll();
		// 서비스단 생성 후
		List<Question> questionList = questionService.getList();
		
		model.addAttribute("questionList", questionList);
		return "question_list";
	}
	
	@RequestMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		
		return "question_detail";
	}
	
}
