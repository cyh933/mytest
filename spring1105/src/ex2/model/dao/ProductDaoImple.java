package ex2.model.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2.model.domain.Product;

public class ProductDaoImple implements ProductDao{
// Product라는 객체의 값을
// Spring Bean으로 선언한 후 값을 지정하고
// 현재 ProductDaoImple에서 주소값으로 주입받아서 구현해보기!!
	private Product product;
	
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public Product getProduct() {
		/*//  가상 데이터 만들어서 리턴함 ->  서비스가 호출될때 return함.
		return new Product("스프링4", 50000);*/
		return product;
	}
	
}
