package com.brunopego.services;

import org.springframework.mail.SimpleMailMessage;

import com.brunopego.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
