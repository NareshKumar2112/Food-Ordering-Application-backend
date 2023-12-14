package com.example.demo.Datacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.Data;
import com.example.demo.model.Feedback;
import com.example.demo.model.FoodDetail;
import com.example.demo.model.History;
import com.example.demo.model.Orders;
import com.example.demo.model.Sample;
import com.example.demo.service.Service;

@RestController
@CrossOrigin
public class Controller {

	@Autowired
	private Service service;
	
	@PostMapping("/post")
	public Data PostData(@RequestBody Data data)
	{
		return service.postData(data);
	}
	
	@PostMapping("/postorder/{email}")
	public boolean store(@PathVariable String email)
	{
		List<History> his=service.getBefHis();
		System.out.println(his);
		
		for(int i=0;i<his.size();i++)
		{
			History food=his.get(i);
			Orders order=new Orders();
			order.setAmount(food.getAmount());
			order.setEmail(food.getEmail());
			order.setFoodname(food.getFoodname());
			order.setQuantity(food.getQuantity());
			order.setDate(java.time.LocalDate.now().toString());
			service.addOrders(order);
		}
		return true;
	}
	@GetMapping("/getdata")
	public List<FoodDetail> showorders()
	{
		return service.showorders();
	}
	@GetMapping("/getAll")
	public List<Data> getData()
	{
		return service.getData();
	}
	@GetMapping("/getdata/{customerName}")
	public List<FoodDetail> getorders(@PathVariable String customerName)
	{
		return service.getorders(customerName);
	}
	@GetMapping("/valid/{email}/{password}")
	public boolean check(@PathVariable String email,@PathVariable String password )
	{
		Data data=service.check(email,password);
		if(data!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@GetMapping("/showAll")
	public List<Sample> show()
	{
		return service.show();
	}
	
	@DeleteMapping("/delete/{customerName}")
	public boolean delete(@PathVariable String customerName)
	{
		 return service.delete(customerName);
	}
	
	@PostMapping("/feedback")
	public Feedback storefeed(@RequestBody Feedback feed)
	{
		return service.storefeed(feed);
	}
	@GetMapping("/getfeed")
	public List<Feedback> getFeed()
	{
		return service.getFeed();
	}
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
	}
	@GetMapping("/getorders")
	public List<Orders> getorder()
	{
		return service.getorder();
	}
	@GetMapping("getHistory/{Name}")
	public List<Orders> getHistory(@PathVariable String Name)
	{
		return service.getHistory(Name);
	}
	
	@PostMapping("/befHis")
	public History postBef(@RequestBody History history)
	{
		return service.postBef(history);
	}
	@GetMapping("/getBefHis")
	public List<History> getBefHis()
	{
		return service.getBefHis();
	}
}
