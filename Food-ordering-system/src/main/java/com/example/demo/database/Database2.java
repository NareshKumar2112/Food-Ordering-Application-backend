package com.example.demo.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Data;
import com.example.demo.model.Sample;

@Repository
public interface Database2 extends JpaRepository<Sample,String>{

	@Query(value="select * from sample",nativeQuery=true)
	public List<Sample> findShow();
}
