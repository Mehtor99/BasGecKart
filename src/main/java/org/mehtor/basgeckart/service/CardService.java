package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Card;
import org.mehtor.basgeckart.repository.CardRepository;
import org.mehtor.basgeckart.utility.enums.PaymentType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CardService {
	private CardRepository cardRepository;
	private RechargeService rechargeService;
	
	public void addAllCard(List<Card> cardList) {
		cardRepository.saveAll(cardList);
	}
	
	public void addBalance(Long cardId, Double amount, PaymentType paymentType) {
		Optional<Card> card = cardRepository.findById(cardId);
		if (card.isPresent()) {
			card.get().addBalance(amount);
			rechargeService.addRecharge(cardId,paymentType,amount);
			cardRepository.save(card.get());
		}
	}
	
	
	
}