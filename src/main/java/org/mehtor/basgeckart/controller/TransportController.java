package org.mehtor.basgeckart.controller;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Transport;
import org.mehtor.basgeckart.service.TransportService;
import org.mehtor.basgeckart.utility.enums.TransportType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/transport")
public class TransportController {
	private final TransportService transportService;
	
	@GetMapping("/add-all-transports")
	public String addAllTransports() {
		Transport transport = Transport.builder()
				.transportType(TransportType.BUS)
				.price(10D)
				.build();
		Transport transport1 = Transport.builder()
		                               .transportType(TransportType.FERRY)
		                               .price(15D)
		                               .build();
		
		transportService.addTransport(transport);
		transportService.addTransport(transport1);
		
		return "Kayitlar basarili";
	}
}