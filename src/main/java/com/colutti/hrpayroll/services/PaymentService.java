package com.colutti.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.colutti.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayments(Long id, int days) {
		return new Payment("Vinicius", 200.0, days);
	}
}
