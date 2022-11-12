package com.board.pra;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void contextLoads() {
		
		Question question = new Question();
		question.setSubject("JPA 테스트중입니다.");
		question.setContent ("스프링부트랑 gradle 그리고 jpa랑 hibernate");
		question.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question);
		
		Question questiontwo = new Question();
		questiontwo.setSubject("크리스마스 최고");
		questiontwo.setContent ("1일 1캐롤");
		questiontwo.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(questiontwo);
	}

}
