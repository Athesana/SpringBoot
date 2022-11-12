package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayhi() {
		//리턴 문자를 수정했지만 페이지 상의 내용은 변경되지 않는다.
		// why? local was가 변경된 클래스를 리로딩하지 않았기 때문(Maven에서는 바로 적용된다.)
		return "스미스 부케 시트러스 내놔!!!";
	}
	
	/*
	 * [Lombok]
	 * 자바 클래스에 getter, setter, 생성자 등을 자동으로 만들어주는 도구로써 깔끔한 소스코드를 만들 수 있다.
	 */
	
	// 프로젝트명 + Application
	// 스프링부트의 시작을 담당하는 파일
	// @SpringBootApplication : 스프링부트의 설정을 관리하는 어노테이션
	
	// 데이터베이스를 이용하려면?
	// 쿼리를 통해 원하는 데이터들을 조회하거나 삭제할 수 있었음.
	// 이제는, ORM을 통해 자바 문법으로 데이터베이스를 다룰 수 있다. (자바 문법으로 쿼리를 대신한다.)
	
	/*
	 * [JPA]
	 * Java Persistence API, 인터페이스이다. (실제 구현하는 클래스가 필요하다. => Hibernate)
	 * 자바 ORM 기술 표준
	 */
	
	// 제목 컬럼명이 subject이고, 내용 컬럼이 content라 가정했을 때 쿼리를 이용해서 데이터를 추가하려면? -> INSERT문 사용했었음
	// ORM 경우는 1. 간단한 쿼리에 좋다. 2. 성능이 좋다. 3. DB 마이그레이션과 별개이다. 
	
	/*
	 * [엔티티]
	 * 데이터베이스 테이블과 매핑되는 자바 클래스
	 * 질문과 답변에 대한 table 만든다고 생각
	 */

	/*
	 * [레파지토리]
	 * 엔티티만으로 DB에 데이터를 저장하거나 조회하는 것은 불가능하다.
	 * 따라서, 데이터 처리를 위해서 실제 DB와 연동하는 JPA 레파지토리가 필요하다.
	 * 
	 * 스프링 부트에서의 레파지토리
	 * => 엔티티에 의해 생성된 DB 테이블에 접근하는 메서드들을 사용하기 위한 인터페이스
	 * => CRUD 처리를 어떤식으로 처리할지 정의하는 계층
	 */
	
	/*
	 * [Junit]
	 * Java에서 독립된 단위 테스트를 지원해주는 프레임워크
	 * 
	 * - @Test : 테스트 수행 메서드
	 * - @Before : @Test 어노테이션 메소드 실행 전에 반드시 수행하는 메서드
	 * - @After : @Test 어노테이션 메소드 실행 후에 반드시 수행하는 메서드
	 * - @Ignore : 테스트 스킵
	 */
	
	
	/*
	 * [URL Prefix]
	 * 공통된 url에서 일부분은 해당 컨트롤러에서 바로 적용할 수 있도록 설정하는 URL 매핑규칙
	 */
}
