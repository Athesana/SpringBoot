package com.board.pra.answer;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.board.pra.question.Question;

import lombok.Getter;
import lombok.Setter;

//엔티티 크래스
//아래의 클래스들이 DB 테이블을 대신한다. 더 정확히는 DB 테이블과 매핑된다.
/*
 * Answer 같은 경우는 Question과 외래키 관계일 것이다.
 * @ManyToOne 어노테이션 이용, Question 쪽에는 @OneToMany 이용
 */
@Getter
@Setter
@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition="TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	@ManyToOne
	private Question question;
	
}