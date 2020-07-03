package com.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.model.Model;
import com.batch.repo.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	private ModelRepository modelRepo;

	@Override
	public List<Model> getByPinCode(String pinCode) {		
		return modelRepo.getByPincode(pinCode);
	}

}
