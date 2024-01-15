package Entities;

import Enums.PaymentStatus;

public class Payment {
    private PaymentStatus status;
    private Float price;
    private String paymentMethod;

    public Payment(PaymentStatus status, Float price, String paymentMethod) {
        this.status = status;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
