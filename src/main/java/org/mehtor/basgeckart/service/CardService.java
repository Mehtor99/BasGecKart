package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Card;
import org.mehtor.basgeckart.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CardService {
	private CardRepository cardRepository;
	
	public void addAllCard(List<Card> cardList) {
		cardRepository.saveAll(cardList);
	}
	
	public void addBalance(Long cardId,Double balance) {
		Optional<Card> card = cardRepository.findById(cardId);
		if (card.isPresent()) {
			card.get().addBalance(balance);
			cardRepository.save(card.get());
		}
	}
}