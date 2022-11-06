package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String task;
	
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Task(Long id, String name, String email, String task) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.task = task;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", email=" + email + ", task=" + task + "]";
	}
	
	
	
	
	

}
