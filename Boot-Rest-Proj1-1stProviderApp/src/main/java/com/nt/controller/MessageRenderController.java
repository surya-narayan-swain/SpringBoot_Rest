package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg-api")   //global path
public class MessageRenderController {

	@GetMapping("/wish")   //method path
	public ResponseEntity<String> showMessage()
	{
		//get system date and time
		LocalDateTime ldt=LocalDateTime.now();
		//generate wish message
		String msg=null;
		int hour=ldt.getHour();
		if(hour<12)
			msg="Good morning";
		else if(hour<16)
			msg="Good Afternoon";
		else if(hour<20)
			msg="Good Eveneing";
		else
			msg="Good Night";
		
		//create and return Respose object having response body and ststus code
		ResponseEntity<String> entity=new ResponseEntity<String>(msg,HttpStatus.OK);
		return entity;
	}
}
