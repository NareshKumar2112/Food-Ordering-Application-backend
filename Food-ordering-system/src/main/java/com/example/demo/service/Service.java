package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.database.Database;
import com.example.demo.database.Database2;
import com.example.demo.database.Database3;
import com.example.demo.database.Database4;
import com.example.demo.database.Database5;
import com.example.demo.database.Database6;
import com.example.demo.database.Database7;
import com.example.demo.model.Customer;
import com.example.demo.model.Data;
import com.example.demo.model.Feedback;
import com.example.demo.model.FoodDetail;
import com.example.demo.model.History;
import com.example.demo.model.Orders;
import com.example.demo.model.Sample;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private Database3 database2;
	
	@Autowired
	private Database database;
	
	@Autowired
	private Database2 database1;
	
	@Autowired
	private Database4 database4;
	
	@Autowired
	private Database5 database5;
	
	@Autowired
	private Database6 database6;
	
	@Autowired
	private Database7 database7;
	
	public Data postData(Data data)
	{
		return database.save(data);
	}
	
	public List<Data> getData()
	{
		return database.findAll();
	}
	public Data check(String email,String password)
	{ 
		return database.check(email,password);
	}
	public List<Sample> show()
	{
		return database1.findShow();
	}
	public List<FoodDetail> getorders(String customername)
	{
		return database2.getorders(customername);
	}
	public List<FoodDetail> showorders()
	{
		return database2.findorders();
	}
	
	public FoodDetail store(FoodDetail food)
	{
		return database2.save(food);
	}
	
	public boolean delete(String name)
	{
		 if(database2.delete1(name)==1)
		 {
			 return true;
		 }
		 return false;
	}
	public Feedback storefeed(Feedback feed)
	{
		return database4.save(feed);
	}
	
	public Customer addCustomer(Customer customer)
	{
		return database5.save(customer);
	}
	public void addOrders(Orders order)
	{
		database6.save(order);
	}
	public List<Orders> getorder()
	{
		return database6.findAllOrders();
	}
	public List<Feedback> getFeed()
	{
		return database4.findAll();
	}
	public List<Orders> getHistory(String name)
	{
		return database6.getHistory(name);
	}
	public History postBef(History history)
	{
		return database7.save(history);
	}

	public List<History> getBefHis() {
		
		return database7.findAll();
	}
}
