package com.alphonse.accountmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.alphonse.accountmanage.entity")

public class AccountmanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountmanageApplication.class, args);
	}
}
