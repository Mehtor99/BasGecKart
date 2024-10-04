package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.entity.Passenger;
import org.mehtor.basgeckart.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

	private PassengerRepository passengerRepository;
	

	
	public void addPassenger(Passenger passenger) {
		passengerRepository.save(passenger);
	}
	
	public void addAllPassengers(List<Passenger> passengers) {
		passengerRepository.saveAll(passengers);
	}

	public void updatePassenger(Passenger passenger) {
		passengerRepository.saveAndFlush(passenger);
	}
	public List<Passenger> findAll() {
		return passengerRepository.findAll();
	}
}