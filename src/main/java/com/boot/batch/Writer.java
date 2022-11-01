package com.boot.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception { //Here it gets the list of items
		
		System.out.println("Inside Write");
		System.out.println("Writing Data: "+items);
		
	} 
 
}
