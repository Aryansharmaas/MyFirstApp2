package com.Aryan.MyfirstApp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aryan.MyfirstApp.Oojo.AddRequest;

@RestController
@RequestMapping("/api")
public class AddController {
	
	@PostMapping("/add")
	public int add(@RequestBody AddRequest request) {
	
		System.out.println("Incoming values are"
				+ "|| request:" +request);
	
		int sum =  request.getNum1() +  request.getNum2();
	
		System.out.println("sum:" +sum);
		return sum;
		
	}

}
