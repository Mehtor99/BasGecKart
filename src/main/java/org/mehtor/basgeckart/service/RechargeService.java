package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Recharge;
import org.mehtor.basgeckart.repository.RechargeRepository;
import org.mehtor.basgeckart.utility.enums.PaymentType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RechargeService {
	RechargeRepository rechargeRepository;
	
	public void addRecharge(Long cardId, PaymentType paymentType,Double amount) {
		Recharge recharge = Recharge.builder()
				                      .cardId(cardId)
				                      .rechargeDate(LocalDateTime.now())
				                      .amount(amount)
				                      .paymentType(paymentType)
		                            .build();
		rechargeRepository.save(recharge);
	}
}