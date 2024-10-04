package org.mehtor.basgeckart.controller;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.service.PaymentService;
import org.mehtor.basgeckart.service.TransportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {
	private PaymentService paymentService;
	
	

}