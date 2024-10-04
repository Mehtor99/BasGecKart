package org.mehtor.basgeckart.repository;

import org.mehtor.basgeckart.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {


}