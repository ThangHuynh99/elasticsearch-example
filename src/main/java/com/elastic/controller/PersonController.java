package com.elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.entity.Person;
import com.elastic.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public void save(@RequestBody final Person person) {
		personService.save(person);
	}
	
	@GetMapping("/person/{id}")
	public Person findById(@PathVariable("id") final String id) {
		return personService.findById(id);
	}
}
