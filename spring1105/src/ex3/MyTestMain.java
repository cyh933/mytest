package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTestMain {
public static void main(String[] args) {
	// ������ �����ε��������� �켱������ String�� �ִ�.
	// ���� int���� ȣ���ϰ� �ʹٸ� value�� type�� �����ϸ� �ȴ�!!!!!!
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3/mytest.xml");
	MyTest mt = ctx.getBean("mytest",MyTest.class);
	System.out.println(mt.printMyTest());
	MyTest mt1 = ctx.getBean("mytest2",MyTest.class);
	System.out.println(mt1.printMyTest());
	MyTest mt2 = ctx.getBean("mytest3",MyTest.class);
	System.out.println(mt2.printMyTest());
	
}
}
