package com.batch.processor;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.model.Model;
import com.batch.repo.ModelRepository;

@Component
public class DBWriter  implements ItemWriter<Model>{
 
	@Autowired
	private ModelRepository modelRepository;
	
	@Override
	public void write(List<? extends Model> items) throws Exception {
		System.out.println("Ite,ms "+items);
		modelRepository.saveAll(items);
		
	}

}
