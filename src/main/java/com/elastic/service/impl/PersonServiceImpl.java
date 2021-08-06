package com.elastic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elastic.entity.Person;
import com.elastic.repository.PersonRepository;
import com.elastic.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	private final PersonRepository personRepository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository person) {
		this.personRepository = person;
	}

	@Override
	public void save(Person person) {
		personRepository.save(person);
	}

	@Override
	public Person findById(String id) {
		return personRepository.findById(id).orElse(null);
	}
}
