package com.vishnu.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishnu.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
