package org.mehtor.basgeckart.service;

import lombok.AllArgsConstructor;
import org.mehtor.basgeckart.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseService {
	ExpenseRepository expenseRepository;
}