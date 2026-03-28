package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${student.id}")
	private int id;
	@Value("${student.name}")
	private String name;
	@Value("${student.college}")
	private String college;
	@Value("${student.city}")
	private String city;
	@Value("${student.feedback}")
	private String feedback;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", city=" + city + ", feedback="
				+ feedback + "]";
	}
}
