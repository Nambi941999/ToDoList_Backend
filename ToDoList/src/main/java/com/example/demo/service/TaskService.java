package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JpaRepo;
import com.example.demo.entity.Task;

@Service
public class TaskService {
	
	@Autowired
	private JpaRepo repo;
	
	
	//Save 
	public Task save(Task task) {
		
		Task save = repo.save(task);
		
		return save;
	}
	
	//get result
	
	public List<Task> get() {
		
		List<Task> findAll = repo.findAll();
		
		return findAll;
		
	}
	
	//get by id
	public Optional<Task> findById(Long id) {
		
		Optional<Task> findById = repo.findById(id);
		
		return findById;
		
	}
	
	//delete by id
	public boolean delete(Long id) {
		
		boolean existsById = repo.existsById(id);
		
		if(existsById) {
			repo.deleteById(id);
		}
		
		return existsById;
		
	}
	
	//update by id
	
	public Task update(Long id,Task task) {
		
		boolean existsById = repo.existsById(id);
		
		if(existsById) {
			
			Task update1 = repo.save(task);
			
			System.out.println("Service update"+update1);
			
		}
		
		return task;
	}

}
