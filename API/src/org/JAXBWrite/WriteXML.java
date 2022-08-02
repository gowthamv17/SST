package org.JAXBWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.pojo.Product;
import org.pojo.ProductDetails;
import org.pojowrite.Address_Write;
import org.pojowrite.ProductDetails_Write;
import org.pojowrite.Product_Write;

public class WriteXML {

	public static void main(String[] args) throws JAXBException {
		
		convXML();
	}

	public static void convXML() throws JAXBException{
		
		JAXBContext context = JAXBContext.newInstance(ProductDetails.class);
		Marshaller mn = context.createMarshaller();
		
		File xmlpaths = new File("D:\\Selenium files\\workspace\\API\\ProductDetails1.xml");
		
		ProductDetails_Write details = new ProductDetails_Write();
		List<Product_Write> p = new ArrayList<Product_Write>();
		
		Product_Write p1 = new Product_Write();
		p1.setProductname("Samsung");
		p1.setQuantity(5);
		p1.setPrices(50000);
		Address_Write a1 = new Address_Write();
		a1.setCity("chennai");
		a1.setStreetname("kamarajar nagar");
		p1.setAddress_Write(a1);
		
		Product_Write p2 = new Product_Write();
		p2.setProductname("Nokia");
		p2.setQuantity(5);
		p2.setPrices(40000);
		Address_Write a2 = new Address_Write();
		a2.setCity("Trichy");
		a2.setStreetname("Thillai Nagar");
		p2.setAddress_Write(a2);
		
		p.add(p1);
		p.add(p2);
		
		details.setProduct_Write(p);
		
		mn.marshal(details, xmlpaths);
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
}
}