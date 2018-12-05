package ex2.model.service;

import ex2.model.dao.ProductDao;
import ex2.model.domain.Product;

public class ProductServiceImple implements ProductService{

	private ProductDao ProductDao;
	
	@Override
	public Product getProduct() {	
		return ProductDao.getProduct();
	}
	
	public void setProductDao(ProductDao productDao) {
		ProductDao = productDao;
	}

}
