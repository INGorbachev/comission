package com.example.comission.dto;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionDto {

    private Long clientId;
    private Date localDate;
    private String currency;
    private BigDecimal amount;

    public TransactionDto() {
    }

    public TransactionDto(Long clientId, Date localDate, String currency, BigDecimal amount) {
        this.clientId = clientId;
        this.localDate = localDate;
        this.currency = currency;
        this.amount = amount;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "clientId=" + clientId +
                ", localDate=" + localDate +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}

