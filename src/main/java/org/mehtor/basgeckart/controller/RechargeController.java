package org.mehtor.basgeckart.controller;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Recharge;
import org.mehtor.basgeckart.service.RechargeService;
import org.mehtor.basgeckart.utility.enums.PaymentType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@AllArgsConstructor
@RestController
@RequestMapping("/recharge")
public class RechargeController {
	private final RechargeService rechargeService;
	
	@PostMapping("/add-recharge")
	public void addRecharge(Long cardId,PaymentType paymentType,Double amount) {
		rechargeService.addRecharge(cardId,paymentType,amount);
		
	}
	
}