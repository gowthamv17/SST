package org.JAXB;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.pojo.Product;
import org.pojo.ProductDetails;

public class ReadXML {

	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub

		readValue();
	}

	public static void readValue() throws JAXBException{
		
		JAXBContext context = JAXBContext.newInstance(ProductDetails.class);
		Unmarshaller un = context.createUnmarshaller();
		
		File xmlpath = new File("D:\\Selenium files\\workspace\\API\\ProductDetails.xml");
		
		Object obj = un.unmarshal(xmlpath);
		
		ProductDetails p = (ProductDetails) obj;
		
	    List<Product> li = p.getProduct();
	for(Product pr : li){
		
		
		System.out.println("Product Details");
		System.out.println("Product Name is " +pr.getProductname());
		System.out.println("Quantity is "+pr.getQty());
		System.out.println("Price is "+pr.getPrice());
		System.out.println("Order ID is "+pr.getOrderID());
		System.out.println();
		
		System.out.println("DeliveryAddress");
		System.out.println("StreetName is "+pr.getDeliveryAddress().getStreetname());
		System.out.println("City is "+pr.getDeliveryAddress().getCity());
		System.out.println("District is "+pr.getDeliveryAddress().getDistrict());
		System.out.println("Country is "+pr.getDeliveryAddress().getCountry());
		System.out.println();
		System.out.println("Contact Details");
		System.out.println("email ID is "+pr.getDeliveryAddress().getContactDetails().getEmailID());
		System.out.println();
		System.out.println("Phone");
		System.out.println("mobileNo is "+pr.getDeliveryAddress().getContactDetails().getPhone().getMobileNo());
		System.out.println("landLineNo is "+pr.getDeliveryAddress().getContactDetails().getPhone().getLandLineNo());
	
	}
		
	}
}
