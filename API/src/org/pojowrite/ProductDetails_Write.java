package org.pojowrite;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDetails_Write {

	
	

	private List<Product_Write> Product_Write;

	public List<Product_Write> getProduct_Write() {
		return Product_Write;
	}

	public void setProduct_Write(List<Product_Write> product_Write) {
		Product_Write = product_Write;
	}

	
}
