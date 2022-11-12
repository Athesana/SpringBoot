package com.board.pra.question;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.board.pra.answer.Answer;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

//엔티티 크래스
//아래의 클래스들이 DB 테이블을 대신한다. 더 정확히는 DB 테이블과 매핑된다.
/*
 * @Entity  		: 엔티티 클래스임을 선언하는 어노테이션
 * @Id				: 기본키 지정, 어노테이션으로 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
 * @GeneratedValue	: like 오라클's 시퀀스
 * @Column			: 컬럼의 세부 설정 필요시 사용
 * 		- columnDefinition : 글자수 제한 없음
 * 		- 없어도 컬럼으로 인식한다. 만약, 컬럼으로 인식하고싶지 않은 필드에는 @Transient 를 붙인다.
 */
@Getter
@Setter
@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=200)
	private String subject;
	
	@Column(columnDefinition="TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Answer> answerList;
}
