package com.sudip.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerJenkinsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
