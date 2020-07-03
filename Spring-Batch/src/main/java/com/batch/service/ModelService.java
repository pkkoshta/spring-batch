package com.batch.service;

import java.util.List;

import com.batch.model.Model;

public interface ModelService {
	
	public List<Model> getByPinCode(String pinCode);

}
