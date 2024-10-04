package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Card;
import org.mehtor.basgeckart.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CardService {
	private CardRepository cardRepository;
	
	public void addAllCard(List<Card> cardList) {
		cardRepository.saveAll(cardList);
	}
}