package com.colutti.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colutti.hrpayroll.entities.Payment;
import com.colutti.hrpayroll.entities.Worker;
import com.colutti.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayments(Long id, int days) {
		Worker worker = workerFeignClient.findById(id).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
