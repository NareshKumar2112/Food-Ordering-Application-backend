package com.example.demo.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.FoodDetail;
import com.example.demo.model.Sample;


public interface Database3 extends JpaRepository<FoodDetail,String> {

	@Query(value="select * from food_details",nativeQuery=true)
	public List<FoodDetail> findorders();
	
	@Query(value="select * from food_details where customer_name=?",nativeQuery=true)
	public List<FoodDetail> getorders(String customer_name);
	
	@Modifying
	@Transactional
	@Query(value="delete from food_details where customer_name=?",nativeQuery=true)
	public int delete1(String customer_name);
	
}
