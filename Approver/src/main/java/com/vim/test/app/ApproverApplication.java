package com.vim.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.vim.test")
@EnableMongoRepositories(basePackages="com.vim.test.repository")
public class ApproverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApproverApplication.class, args);
	}

}