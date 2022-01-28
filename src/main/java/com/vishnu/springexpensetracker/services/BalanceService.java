package com.vishnu.springexpensetracker.services;

import com.vishnu.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
