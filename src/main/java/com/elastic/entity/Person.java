package com.elastic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.elastic.helper.Indices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = Indices.PERSON_INDEX)
@Setting(settingPath = "static/es-settings.json")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	@Id
	@Field(type = FieldType.Keyword)
    private String id;
	@Field(type = FieldType.Text)
    private String name;
   
}
