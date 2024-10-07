package org.mehtor.basgeckart.controller;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Card;
import org.mehtor.basgeckart.entity.Recharge;
import org.mehtor.basgeckart.service.CardService;
import org.mehtor.basgeckart.utility.DataGenerator;
import org.mehtor.basgeckart.utility.enums.CardType;
import org.mehtor.basgeckart.utility.enums.PaymentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/card")
public class CardController {
	private final CardService cardService;
	private DataGenerator dataGenerator = new DataGenerator()  ;
	
	@GetMapping("/add-all-cards")
	public String addAllCards() {
		Card card = Card.builder()
		                .cardNumber(dataGenerator.generateCardNumber())
		                .cardType(CardType.HANDICAPPED)
						.visaDate(LocalDate.now().plusYears(2))
						.build();
		
		Card card1 = Card.builder()
		                .cardNumber(dataGenerator.generateCardNumber())
		                .cardType(CardType.STUDENT)
		                .visaDate(LocalDate.now().plusYears(1))
		                .build();
		
		Card card2 = Card.builder()
		                .cardNumber(dataGenerator.generateCardNumber())
		                .cardType(CardType.STANDARD)
		                .visaDate(LocalDate.now().plusYears(99))
		                .build();
		
		Card card3 = Card.builder()
		                .cardNumber(dataGenerator.generateCardNumber())
		                .cardType(CardType.TEACHER)
		                .visaDate(LocalDate.now().plusYears(2))
		                .build();
		
		cardService.addAllCard(List.of(card, card1, card2, card3));
		return "Kayıtlar başarıyla eklendi";
	}
	
	@PostMapping("/add-balance")
	public ResponseEntity<String> addBalance (Long cardId, Double amount, PaymentType paymentType) {
		try {
			cardService.addBalance(cardId,amount,paymentType);
			return ResponseEntity.ok("Bakiye eklendi");
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Bakiye eklenirken hata !!");
		}
		
	}
	
}