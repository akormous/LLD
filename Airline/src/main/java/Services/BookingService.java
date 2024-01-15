package Services;

import Entities.Booking;
import Entities.Flight;

import java.util.List;

public class BookingService {
    private List<Booking> bookings;

    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Boolean book(Flight flight) {
        return true;
    }

    public Booking getBooking(String bookingId) {
        return null;
    }
}
