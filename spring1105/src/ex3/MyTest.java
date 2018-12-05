package ex3;

public class MyTest {
	private int num;
	private String msg;
	private String code;
	public MyTest(int num) {
		this.num = num;
		System.out.println("int형 생성자가 호출");
	}
	public MyTest(String msg) {
		this.msg = msg;
		System.out.println("String형 생성자가 호출");
	}
	public MyTest(int num, String msg) {
		this.num = num;
		this.msg = msg;
	}
	public MyTest(String code, int num) {
		this.num = num;
		this.code = code;
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num : ").append(num);
		sb.append("// msg : ").append(msg);
		sb.append("// code : ").append(code);
		return sb.toString();
	}
	
}
