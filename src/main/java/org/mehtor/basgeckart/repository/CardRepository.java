package org.mehtor.basgeckart.repository;

import org.mehtor.basgeckart.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {


}