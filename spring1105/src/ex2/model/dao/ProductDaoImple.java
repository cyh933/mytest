package ex2.model.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2.model.domain.Product;

public class ProductDaoImple implements ProductDao{
// Product��� ��ü�� ����
// Spring Bean���� ������ �� ���� �����ϰ�
// ���� ProductDaoImple���� �ּҰ����� ���Թ޾Ƽ� �����غ���!!
	private Product product;
	
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public Product getProduct() {
		/*//  ���� ������ ���� ������ ->  ���񽺰� ȣ��ɶ� return��.
		return new Product("������4", 50000);*/
		return product;
	}
	
}
