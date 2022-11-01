package com.boot.batch;

import org.springframework.context.annotation.Bean;

public class BatchConfig {

	@Bean
	public Reader reader() {
		return new Reader();
	}
	
	@Bean
	public Writer writer() {
		return new Writer();
	}
	
	@Bean
	public Processor processor() {
		return new Processor();
	}
	
	@Bean
	public MyJobLIstener listener() {
		return new MyJobLIstener();
	}
}
