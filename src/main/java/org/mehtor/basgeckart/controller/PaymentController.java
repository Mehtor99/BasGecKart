package org.mehtor.basgeckart.controller;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Payment;
import org.mehtor.basgeckart.service.PaymentService;
import org.mehtor.basgeckart.service.TransportService;
import org.mehtor.basgeckart.utility.DataGenerator;
import org.mehtor.basgeckart.utility.enums.PaymentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {
	private PaymentService paymentService;
	private DataGenerator dataGenerator;
	
	@GetMapping("/add-all-payments")
	public String addAllPayment(){
		Payment payment = Payment.builder()
				.cardNumber(dataGenerator.generateCardNumber())
				.paymentType(PaymentType.CREDIT_CARD)
		                         .build();
		
		Payment payment1 = Payment.builder()
		                         .cardNumber(dataGenerator.generateCardNumber())
		                         .paymentType(PaymentType.DEBIT_CARD)
		                         .build();
		
		Payment payment2 = Payment.builder()
		                         .cardNumber(dataGenerator.generateCardNumber())
		                         .paymentType(PaymentType.CREDIT_CARD)
		                         .build();
		
		Payment payment3 = Payment.builder()
		                         .cardNumber(dataGenerator.generateCardNumber())
		                         .paymentType(PaymentType.DEBIT_CARD)
		                         .build();
		
		
		paymentService.addAllPayment(List.of(payment,payment1,payment2,payment3));
		
		return "Kayıtlar başarıyla eklendi";
	}

}