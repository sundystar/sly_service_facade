package com.sly.facade.service;


import com.sly.demo.model.APIRequest;
import com.sly.demo.model.APIResult;
public interface UserService {
	
	public void push(Object o);
	
	public APIResult getUserList(APIRequest request);

	public APIResult PUT(APIRequest apiRequest);

	public APIResult POST(APIRequest apiRequest);

	public APIResult del(APIRequest apiRequest);
}
