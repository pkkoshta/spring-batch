package com.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.model.Model;
@Component
public class BatchProcessor  implements ItemProcessor<Model,Model>{

	@Override
	public Model process(Model item) throws Exception {		
		return item;
	}
	

}
