package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		// BeanFactory는 상위 컨테이너이기 때문에 사용은 하지 않는다.
		// GenericApplicationContext : Spring 3.0부터 지원해주는 제네릭 기반의 컨테이너 객체 (jdk5부터 지원)
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		
		// 생성된 객체 HelloBean에서 주소값을 얻어오기
		// HelloBean hb = ctx.getBean("hello", HelloBean.class);
		// -> (hello.xml의 id값 , 제네릭으로 표현)
		HelloBean hb = ctx.getBean("hello", HelloBean.class);
		System.out.println("Result :"+hb.printMessage());
		
		// hello.xml에서 scope="prototype"으로 주면 싱글톤 레지스터리에 등록이 안된다.
		HelloBean hb2 = ctx.getBean("hello", HelloBean.class);
		System.out.println(hb == hb2);
		
		// *연습문제*
		// today.jsp에서 항상 현재날짜로 출력을 원한다.
		// TodayBean을 만들어서 현재 날짜와 스프링으로부터 '김길동'이란 이름을 주입받는 bean을 만들어서 출력하시오.
		// prototype으로 name을 받고 TodayBean에서는 날짜를 출력함.
	}
}
