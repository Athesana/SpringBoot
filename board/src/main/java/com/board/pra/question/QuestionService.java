package com.board.pra.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.board.pra.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		//Optional 객체 : NullPointerException 에러 방지하기 위한 Wrapper 클래스
		Optional<Question> question = this.questionRepository.findById(id);
		if(question.isPresent()) {
			//isPresent() : 해당 데이터가 있는지 없는지 검사한다. (0건이냐 아니냐)
			return question.get();
		} else {
			throw new DataNotFoundException("question not found");
		}
		
	}
}
