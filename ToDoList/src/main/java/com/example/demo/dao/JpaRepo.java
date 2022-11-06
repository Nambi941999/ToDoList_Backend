package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Task;

public interface JpaRepo extends JpaRepository<Task, Long>{

}
