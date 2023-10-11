package Actors;

import Actors.Member;
import Entities.Booking;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Member {
    private List<Booking> bookingList = new ArrayList<Booking>();
    public Customer(String name, String email, String id, String phone) {
        super(name, email, id, phone);
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public boolean makeBooking(Booking booking) {
        return true;
    }

    public boolean cancelBooking(Booking booking) {
        return true;
    }
}
