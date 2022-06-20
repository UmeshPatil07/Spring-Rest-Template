package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/myrest")
public class MyRestController  {
	
	@Autowired
	RestTemplate template;
     
	@RequestMapping("/customer")
	public Customer getCustomer() {
		String url="http://localhost:9007/rest/Customer";
		Customer c=template.getForObject(url, Customer.class);
		return c;
				}
	
	 @RequestMapping("/customers")
	 public Iterable<Customer> getCustomers() {
		 String url="http://localhost:9007/rest/customers";
		 Iterable<Customer> c=template.getForObject(url, Iterable.class);
		 return c;
	 }
	 
	 @RequestMapping("/mycustomer/{id}")
	 public Customer getCustomerById(@PathVariable ("id")int id) {
		 String url="http://localhost:9007/rest/Customer/{id}";
		// http://localhost:9007/rest/Customer/4
		 Customer c=template.getForObject(url, Customer.class, id);
		 return c;
	 }
	 
	 @PostMapping("/addcustomer")
	 public Customer addCustomer(@RequestBody Customer c) {
		 String url="http://localhost:9007/rest/addcustomer";
		 Customer c1=template.postForObject(url, c, Customer.class);
		 return c1;
		 }
	 
	 @PutMapping("/modifycustomer")
	 public void modifyCustomer(@RequestBody Customer c) {
	 String url="http://localhost:9007/rest/modifycustomer";
	 template.put(url, c);
	 }
	 
	 @DeleteMapping("/delcustomer/{id}")
	 public void delCustomer(@PathVariable("id")int id) {
		 String url="http://localhost:9007/rest/deletecustomer/{id}";
		 template.delete(url, id);
		 
	 }
	 
	
	 

}
