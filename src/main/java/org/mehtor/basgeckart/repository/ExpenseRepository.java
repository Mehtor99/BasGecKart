package org.mehtor.basgeckart.repository;

import org.mehtor.basgeckart.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}