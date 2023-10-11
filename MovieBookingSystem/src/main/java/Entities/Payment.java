package Entities;

import Enums.PaymentMethod;
import Enums.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private String transactionId;
    private Date createdOn;
    private PaymentStatus status;
    private PaymentMethod method;

    public Payment(double amount, String transactionId, PaymentStatus status, PaymentMethod method) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.createdOn = new Date();
        this.status = status;
        this.method = method;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public PaymentMethod getMethod() {
        return method;
    }
}
