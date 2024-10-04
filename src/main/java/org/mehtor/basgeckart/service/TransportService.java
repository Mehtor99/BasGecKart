package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Transport;
import org.mehtor.basgeckart.repository.TransportRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TransportService {
	private TransportRepository transportRepository;
	
	public void addTransport(Transport transport) {
		transportRepository.save(transport);
	}
}