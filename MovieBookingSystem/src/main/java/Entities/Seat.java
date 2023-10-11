package Entities;

import Enums.SeatType;

public class Seat {
    private SeatType seatType;
    private String seatId;
    private double price;
    private boolean isReserved;

    private Show show;

    public Seat(SeatType seatType, String seatId, double price, boolean isReserved, Show show) {
        this.seatType = seatType;
        this.seatId = seatId;
        this.price = price;
        this.isReserved = isReserved;
        this.show = show;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getSeatId() {
        return seatId;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void markAsAvailable() {
        isReserved = true;
    }

    public boolean book() {
        if(!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }
}
