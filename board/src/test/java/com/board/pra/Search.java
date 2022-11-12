package com.board.pra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;

@SpringBootTest
public class Search {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	// Jpa를 통한 데이터 조회
	@Test
	void testJpa() {
		List<Question> allQuestion = this.questionRepository.findAll();
		// assertEquals(기대값, 실제값) : 기대값이 실제값고 동일하지 않으면 테스트는 fail
		assertEquals(2, allQuestion.size());
		
		Question question = allQuestion.get(1);
		assertEquals("크리스마스 최고", question.getSubject());
	}

}
