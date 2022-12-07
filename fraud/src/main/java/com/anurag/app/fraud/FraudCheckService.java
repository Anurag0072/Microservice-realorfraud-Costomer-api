package com.anurag.app.fraud;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FraudCheckService {
	
	private final FraudCheckHistoryRepository fraudRepository;
	
	
	
	public boolean isFraudulentCustomer(Integer customerId) {
		fraudRepository.save(FraudCheckHistory.builder()
				.CustomerId(customerId)
				.isFraudester(false)
				.createdAt(LocalDateTime.now())
				.build()
				);
		
		return false;
	}

}
