package Entities;

import Actors.Passenger;

import java.util.List;

public class Booking {
    private String id;
    private List<Passenger> passengers;
    private Flight flight;
    private String pnr;
    private Payment payment;

    public Booking(String id, List<Passenger> passengers, Flight flight, String pnr, Payment payment) {
        this.id = id;
        this.passengers = passengers;
        this.flight = flight;
        this.pnr = pnr;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
