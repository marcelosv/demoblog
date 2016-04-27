package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ComponentScan
public class DemoblogApplication {

	@RequestMapping("/bemvindo")
	@ResponseBody
    public String bemVindo(){
        return "Bem vindo ao Blog";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoblogApplication.class, args);
	}
}
