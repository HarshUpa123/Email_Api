package com.email.emailApi.serviceImpl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.email.emailApi.Entity.EmailEntity;
import com.email.emailApi.service.EmailServices;
@Service
public class EmailServicesImpl implements EmailServices{
    @Autowired private JavaMailSender javaMailSender;
    @Value ("${spring.mail.username}") private String sender;
	@Override
	public String sendSimpleEmail(EmailEntity details) {
		
		try {
				SimpleMailMessage mailMessage = new SimpleMailMessage();
				mailMessage.setFrom(sender);
				mailMessage.setTo(details.getRecipient());
				mailMessage.setText(details.getMsgBody());
				mailMessage.setSubject(details.getSubject());
				javaMailSender.send(mailMessage);
				return "mail send successfully......";
		}
	 catch(Exception e){
		return "error while sending email";
	 	}
		
//		public String attachmentWithEmail(EmailEnty details) {
//			try {
//				MimeMessage mimeMessage = new MimeMessage();
////						javaMailSender.createMimeMessage();
//				MimeMessageHelper mimeMessageHelper;
//				try {
//					mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//					mimeMessageHelper.setFrom(sender);
//					mimeMessageHelper.setTo(details.getRecipient());
//					mimeMessageHelper.setSubject(details.getsubject());
//					mimeMessageHelper.setText(details.getMessageBoday());
//					
//				}catch{
//					
//					return null;
//				}
//				
//			}
//		}
	}
	
}

