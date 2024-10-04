package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.repository.PassengerRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PaymentService {
	private PassengerRepository passengerRepository;
	
	
}