package com.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.batch.model.Model;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory, ItemReader<Model>  itemReader, ItemProcessor<Model,Model> itemProcessor, 
			org.springframework.batch.item.ItemWriter<Model> itemWriter) {
		Step step =  stepBuilderFactory.get("ETL-file-Load")
				.<Model, Model>chunk(100)
				.reader(itemReader)
				.processor(itemProcessor)
				.writer(itemWriter)
				.build();
		return 	jobBuilderFactory.get("ETL-Load")
				.incrementer(new RunIdIncrementer())
				.start(step)
				.build();		

	}

	 @Bean
	    public FlatFileItemReader<Model> itemReader() {

	        FlatFileItemReader<Model> flatFileItemReader = new FlatFileItemReader<>();
	        flatFileItemReader.setResource(new FileSystemResource("src/main/resources/Delhi1.csv"));
	        flatFileItemReader.setName("CSV-Reader");
	        flatFileItemReader.setLinesToSkip(1);
	        flatFileItemReader.setLineMapper(lineMapper());
	           return flatFileItemReader;
	    }


	public  LineMapper<Model> lineMapper() {
		DefaultLineMapper<Model> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

        //lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames(new String[] {"officeName", "pinCode", "officeType", "deliveryStatus", "divisionName", "regionName", "circleName", "taluk", "districtName", "stateName", "telephone", "relatedSubOffice", "relatedHeadOffice"});
        BeanWrapperFieldSetMapper<Model> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Model.class);
        

        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);

        return defaultLineMapper;
	}

}
