package com.transactionsmicroservice.transactionsms.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
@Entity
@Table(name="Transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private Long id;

    @Column(name="transaction_nr")
    private String TransactionNr;

    @Column(name="date")
    private Date Date;

    @Column(name="currency")
    private String Currency;

    @Column(name="cardtype")
    private String CardType;

    @Column(name="terminal_id")
    private Long TerminalID;

    @Column(name="status")
    private Boolean Status;

    public Transactions() {
    }

    public Transactions(Long id, String transactionNr, Date date, String currency, String cardType, Long terminalID, Boolean status) {
        this.id = id;
        TransactionNr = transactionNr;
        Date = date;
        Currency = currency;
        CardType = cardType;
        TerminalID = terminalID;
        Status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionNr() {
        return TransactionNr;
    }

    public void setTransactionNr(String transactionNr) {
        TransactionNr = transactionNr;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public Long getTerminalID() {
        return TerminalID;
    }

    public void setTerminalID(Long terminalID) {
        TerminalID = terminalID;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
