package com.batch.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.batch.core.launch.JobLauncher;

import com.batch.model.Model;
import com.batch.repo.ModelRepository;
import com.batch.service.ModelService;
import com.batch.service.ModelServiceImpl;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LoadController.class, ModelServiceImpl.class, ModelRepository.class, JobLauncher.class})
public class LoadControllerTest {
	
	private String pincode = "482003";
	
	@InjectMocks
	private LoadController loadController;
	
	@Mock
	private JobLauncher jobLauncher;
	
	@Mock
	private ModelService service;
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}
	
	@Test
	public void getRecordByPinCodeTest() {
		System.out.println("Get rec");
		List<Model> expectedList = new ArrayList<>();		
	    when(service.getByPinCode(pincode)).thenReturn(expectedList);
		List<Model> originalList = loadController.getRecordByPinCode(pincode);
		assertEquals(expectedList, originalList);
	}

}
