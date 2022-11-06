package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("Task")
public class Control {
	
	@Autowired
	private TaskService service;
	
//	Save Handler
	
	@PostMapping("/save")
	public Task saveHandler(@RequestBody Task task) {
		
		Task saveTask = service.save(task);
		
		return saveTask;
	}
	
	
//	fetch all data
	
	@GetMapping("/get")
	public List<Task> findAll() {
		
		List<Task> list = service.get();
		
		return list;
		
	}
	
	//get by id
	@GetMapping("{id}")
	public Optional<Task> findById(@PathVariable("id") Long id) {
		
		Optional<Task> findById = service.findById(id);
		
		System.out.println(findById);
		
		
		return findById;
		
	}
	
	//delete by id
	
	@GetMapping("/delete/{id}")
	public boolean deleteById(@PathVariable("id") Long id) {
		
		boolean delete = service.delete(id);
		
		System.out.println("delete::"+delete);
		
		return delete;
		
	}
	
	
	//update by id
	@PostMapping("/update/{id}")
	public Task updateById(@PathVariable("id") Long id,@RequestBody Task task) {

		Task update = service.update(id, task);
		
		return update;
		
	}
	
	
	

}
