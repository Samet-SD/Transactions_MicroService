package com.transactionsmicroservice.transactionsms.controller;


import com.transactionsmicroservice.transactionsms.entity.Transactions;
import com.transactionsmicroservice.transactionsms.service.TransactionsService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    public final TransactionsService transactionsService;

    public TransactionsController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

        @GetMapping
        public List<Transactions> findAllTransactions(){
        return transactionsService.findAllTransactions();
        }

        @GetMapping("/{id}")
        public Optional<Transactions> findTransactionById(@PathVariable("id")Long id){
        return transactionsService.findbyId(id);
        }

        @PostMapping
        public Transactions saveTransaction(@RequestBody Transactions transactions){
        return transactionsService.saveTransactions(transactions);
        }

        @PutMapping
        public Transactions updateTransactions(@RequestBody Transactions transactions){
        return transactionsService.updateTransactions(transactions);
        }

        @DeleteMapping
        public void deleteTransaction(@PathVariable("id") Long id){
        transactionsService.deleteTransactions(id);
        }

}
