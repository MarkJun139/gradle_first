package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example", "com.test"})
//다른 하위 패키지들을 사용하고 싶을 때
public class NovSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovSpringWebApplication.class, args);
	}

}
