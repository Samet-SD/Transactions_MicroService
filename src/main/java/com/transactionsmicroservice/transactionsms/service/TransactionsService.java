package com.transactionsmicroservice.transactionsms.service;

import com.transactionsmicroservice.transactionsms.entity.Transactions;

import java.util.List;
import java.util.Optional;

public interface TransactionsService {
    List<Transactions> findAllTransactions();
    Optional<Transactions> findbyId(Long id);
    Transactions saveTransactions(Transactions transactions);
    Transactions updateTransactions(Transactions transactions);
    void deleteTransactions(Long id);

}
