package com.boot.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> { //Data type that is returned(input), data type that needs to be processed(output)

	@Override
	public String process(String item) throws Exception { //the returned item from the reader will be captured in item.
		
		System.out.println("Inside the process");
		
		return "PROCESSED "+ item.toUpperCase(); // For Example item will be: Java, Python, C++
	} 

}
