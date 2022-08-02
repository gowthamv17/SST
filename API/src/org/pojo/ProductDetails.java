package org.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.pojowrite.Product_Write;

@XmlRootElement
public class ProductDetails {
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

	
	

}
