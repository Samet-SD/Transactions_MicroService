package com.transactionsmicroservice.transactionsms.repository;

import com.transactionsmicroservice.transactionsms.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepo extends JpaRepository<Transactions,Long> {
}
