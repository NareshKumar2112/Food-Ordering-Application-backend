package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Feedback;

@Repository

public interface Database5 extends JpaRepository<Customer,String>
{

}
