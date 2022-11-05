package com.board.pra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
 * lombok의 getter, setter 어느테이션을 통해 set, get 등의 메서드를 굳이 작성하지 않아도 사용할 수 있도록 처리해준다.
 * @RequiredArgsConstructor : 해당 속성을 필요로 하는 생성자가 lombok을 통해 자동으로 생성된다.
 * 						-> 의존성 주입에도 사용한다.
 * 						-> 생성자 초기화도 해준다.
 */

@Getter
//@Setter
@RequiredArgsConstructor
public class LombokTest {

	private final String hello;
	private final int lombokInt;
	
	/*
	 * public LombokTest(String hello, int lombokInt) { 
	 * 		this.hello = hello;
	 * 		this.lombokInt = lombokInt; 
	 * }
	 */
	
	public static void main(String[] args) {
		LombokTest lombk = new LombokTest("안녕", 1234);
		//lombk.setHello("안녕");
		//lombk.setLombokInt(1234);
		
		System.out.println(lombk.getHello());
		System.out.println(lombk.getLombokInt());
		
	}

}
