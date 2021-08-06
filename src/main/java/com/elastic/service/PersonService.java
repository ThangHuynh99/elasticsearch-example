package com.elastic.service;

import com.elastic.entity.Person;

public interface PersonService {
	void save(final Person person);
	public Person findById(final String id);
}
