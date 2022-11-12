package com.board.pra.question;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * 레파지토리를 생성하기 위해서는 JpaRepository 인터페이스를 상속받아야 한다.
 * JpaRepository 상속받을 때는 제네릭으로 받아와야 하며
 * 엔티티의 타입(Class명)과 해당 엔티티의 PK의 속성을 지정해야 한다.
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
}
