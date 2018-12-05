package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTestMain {
public static void main(String[] args) {
	// 생성자 오버로딩문제에서 우선순위는 String에 있다.
	// 만약 int형을 호출하고 싶다면 value에 type을 지정하면 된다!!!!!!
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3/mytest.xml");
	MyTest mt = ctx.getBean("mytest",MyTest.class);
	System.out.println(mt.printMyTest());
	MyTest mt1 = ctx.getBean("mytest2",MyTest.class);
	System.out.println(mt1.printMyTest());
	MyTest mt2 = ctx.getBean("mytest3",MyTest.class);
	System.out.println(mt2.printMyTest());
	
}
}
