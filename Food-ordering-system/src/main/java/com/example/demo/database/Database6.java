package com.example.demo.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Orders;
@Repository
public interface Database6 extends JpaRepository<Orders,String> {

	@Query(value="select * from orders order by date desc",nativeQuery=true)
	public List<Orders> findAllOrders();
	
	@Query(value="select * from orders where email=?",nativeQuery=true)
	public List<Orders> getHistory(String name);
}
