package com.idat.EFLeonardoHuamaniPerezConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfLeonardoHuamaniPerezConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfLeonardoHuamaniPerezConfigServerApplication.class, args);
	}

}
