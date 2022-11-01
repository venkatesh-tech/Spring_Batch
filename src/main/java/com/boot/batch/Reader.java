package com.boot.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> { //This ItemReader can fetch data from the files, String is the data type that can be read
	
	private String courses[]= {"Java","Python","C++"};
	private int count;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		if(count<courses.length) {
			return courses[count++];
		}else {
			count=0;
		}
		return null;
	}

}
