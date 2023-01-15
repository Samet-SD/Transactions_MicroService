package com.transactionsmicroservice.transactionsms.service.impl;

import com.transactionsmicroservice.transactionsms.entity.Transactions;
import com.transactionsmicroservice.transactionsms.repository.TransactionsRepo;
import com.transactionsmicroservice.transactionsms.service.TransactionsService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    private final TransactionsRepo transactionsRepo;

    public TransactionsServiceImpl(TransactionsRepo transactionsRepo) {
        this.transactionsRepo = transactionsRepo;
    }

    @Override
    public List<Transactions> findAllTransactions() {
        return transactionsRepo.findAll();
    }

    @Override
    public Optional<Transactions> findbyId(Long id) {
        return transactionsRepo.findById(id);
    }

    @Override
    public Transactions saveTransactions(Transactions transactions) {
        return transactionsRepo.save(transactions);
    }

    @Override
    public Transactions updateTransactions(Transactions transactions) {
        return transactionsRepo.save(transactions);
    }

    @Override
    public void deleteTransactions(Long id) {
         transactionsRepo.deleteAllById(Collections.singleton(id));
    }
}
