package com.VcareU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VcareUApplication {

	@GetMapping("/get/name")
	public String getName(){
		return "Ramesh Rathod";
	}

	public static void main(String[] args) {
		SpringApplication.run(VcareUApplication.class, args);
	}

}
