package com.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elastic.entity.Person;

public interface PersonRepository extends ElasticsearchRepository<Person, String>{
	
}
