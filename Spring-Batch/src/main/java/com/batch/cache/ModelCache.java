package com.batch.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.batch.model.Model;
import com.batch.repo.ModelRepository;

@Component
public class ModelCache {

	@Autowired
	ModelRepository usersRepository;

	@Cacheable(value = "modelCache", key = "#pincode")
	public List<Model> getByPinCode(String pincode) {
		System.out.println("Retrieving from Database for name: " + pincode);
		return usersRepository.getByPincode(pincode);
	}

}
