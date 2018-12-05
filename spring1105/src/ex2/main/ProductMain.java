	package ex2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2.model.domain.Product;
import ex2.model.service.ProductService;

public class ProductMain {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex2/config/product.xml");
		ProductService productservice = ctx.getBean(ProductService.class);
		Product product = productservice.getProduct();
		System.out.println("product = "+product);
	}
}
