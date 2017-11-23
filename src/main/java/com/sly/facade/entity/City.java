package com.sly.facade.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

/**
 * 城市实体类
 * <p>
 * Created by bysocket on 03/05/2017.
 */
@Document(indexName= "provincea", type = "city")
@Setting(settingPath = "/config/hmc-setting.json")
public class City {
	    /**
	     * 城市编号
	     */
	 	@Id
	    private String id;
	    /**
	     * 城市名称
	     */
		@Field(type = FieldType.text, index = true, analyzer="synonym", searchAnalyzer="ik_smart", store = true)
	    private String name;
	    /**
	     * 描述
	     */
		@Field(type = FieldType.text, index = true, analyzer="synonym", searchAnalyzer="ik_smart", store = true)
	    private String description;
	    /**
	     * 城市评分
	     */
	    private Integer score;
	    public String getId() {
	        return id;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public Integer getScore() {
	        return score;
	    }
	    public void setScore(Integer score) {
	        this.score = score;
	    }
		@Override
		public String toString() {
			return "City [id=" + id + ", name=" + name + ", description=" + description + ", score=" + score + "]";
		}
}
