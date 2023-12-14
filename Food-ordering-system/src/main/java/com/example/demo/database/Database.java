package com.example.demo.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Data;
import com.example.demo.model.Sample;

@Repository
public interface Database extends JpaRepository<Data,String>{

	@Query(value="select * from register where email=? and password=?",nativeQuery=true)
	public Data check(String email,String password);
}
