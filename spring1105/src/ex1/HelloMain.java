package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		// BeanFactory�� ���� �����̳��̱� ������ ����� ���� �ʴ´�.
		// GenericApplicationContext : Spring 3.0���� �������ִ� ���׸� ����� �����̳� ��ü (jdk5���� ����)
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		
		// ������ ��ü HelloBean���� �ּҰ��� ������
		// HelloBean hb = ctx.getBean("hello", HelloBean.class);
		// -> (hello.xml�� id�� , ���׸����� ǥ��)
		HelloBean hb = ctx.getBean("hello", HelloBean.class);
		System.out.println("Result :"+hb.printMessage());
		
		// hello.xml���� scope="prototype"���� �ָ� �̱��� �������͸��� ����� �ȵȴ�.
		HelloBean hb2 = ctx.getBean("hello", HelloBean.class);
		System.out.println(hb == hb2);
		
		// *��������*
		// today.jsp���� �׻� ���糯¥�� ����� ���Ѵ�.
		// TodayBean�� ���� ���� ��¥�� ���������κ��� '��浿'�̶� �̸��� ���Թ޴� bean�� ���� ����Ͻÿ�.
		// prototype���� name�� �ް� TodayBean������ ��¥�� �����.
	}
}
