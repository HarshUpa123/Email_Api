package com.email.emailApi.service;
import com.email.emailApi.Entity.EmailEntity;

public interface EmailServices {
	
	String sendSimpleEmail(EmailEntity details);
//	String attachmentWithEmail(EmailEntity details);
}