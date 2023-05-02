package com.email.emailApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.emailApi.Entity.EmailEntity;
import com.email.emailApi.service.EmailServices;
@RestController
public class EmailController {

	@Autowired
	EmailServices emailServices;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody EmailEntity details) {
		return emailServices.sendSimpleEmail(details);
	}
}
