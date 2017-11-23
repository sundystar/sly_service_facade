package com.sly.facade.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName= "symentry", type = "city-type")
@Setting(settingPath = "/config/hmc-setting.json")
@Mapping(mappingPath = "/config/symentry-mapping-json")
public class Symentry {
	
	@Id
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Field(type = FieldType.text, index = true, analyzer="ik_smart", searchAnalyzer="ik_smart", store = true)
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
