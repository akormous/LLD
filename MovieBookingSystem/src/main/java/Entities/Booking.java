package Entities;

import Enums.BookingStatus;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

public class Booking {
    private Payment payment;
    private List<Seat> seat;
    private String bookingId;
    private Date createdOn;
    private BookingStatus bookingStatus;
    private Show show;

    public Booking(Payment payment, List<Seat> seat, String bookingId, Show show) {
        this.payment = payment;
        this.seat = seat;
        this.bookingId = bookingId;
        this.show = show;
        this.createdOn = new Date();
        this.bookingStatus = BookingStatus.PENDING;
    }

    public boolean cancel() {
        if(this.bookingStatus != BookingStatus.CHECKED_IN) {
            this.bookingStatus = BookingStatus.CANCELLED;
            return true;
        }
        return false;
    }

    public boolean confirm() {
        if(this.bookingStatus == BookingStatus.PENDING) {
            this.bookingStatus = BookingStatus.CONFIRMED;
            return true;
        }
        return false;
    }

    public boolean checkIn() {
        if(this.bookingStatus == BookingStatus.CONFIRMED) {
            this.bookingStatus = BookingStatus.CHECKED_IN;
            return true;
        }
        return false;
    }

    public boolean makePayment(Payment payment) {
        return true;
    }

    public boolean reserveSeat(Seat seat) {
        return seat.book();
    }


    public void unreserve(List<Seat> seats) {
        for(Seat seat : seats) {
            seat.markAsAvailable();
        }
    }

    public boolean reserveSeats(List<Seat> requestedSeats) {
        for (Seat seat : requestedSeats) {
            if(!reserveSeat(seat)) {
                unreserve(requestedSeats);
                return false;
            }
        }
        return true;
    }

}
