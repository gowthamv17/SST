package org.pojowrite;

public class Product_Write {

	private String productname;
	private int quantity;
	private long prices;
	private Address_Write Address_Write;
	
	
	public Address_Write getAddress_Write() {
		return Address_Write;
	}
	public void setAddress_Write(Address_Write address_Write) {
		Address_Write = address_Write;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrices() {
		return prices;
	}
	public void setPrices(long prices) {
		this.prices = prices;
	}
	
	
	
}
