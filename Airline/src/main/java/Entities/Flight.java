package Entities;

import Enums.FlightStatus;

import java.util.Date;

public class Flight {
    private Airport source;
    private Airport destination;
    private String id;
    private String name;
    private Terminal departTerminal;
    private Integer departGate;
    private FlightStatus status;
    private Date date;

    public Flight(Airport source, Airport destination, String id, String name, Terminal departTerminal, Integer departGate, FlightStatus status, Date date) {
        this.source = source;
        this.destination = destination;
        this.id = id;
        this.name = name;
        this.departTerminal = departTerminal;
        this.departGate = departGate;
        this.status = status;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terminal getDepartTerminal() {
        return departTerminal;
    }

    public void setDepartTerminal(Terminal departTerminal) {
        this.departTerminal = departTerminal;
    }

    public Integer getDepartGate() {
        return departGate;
    }

    public void setDepartGate(Integer departGate) {
        this.departGate = departGate;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
