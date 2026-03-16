public class Seat {
    private SeatType seatType;
    private BookingStatus bookingStatus;
    private String seatID;
    private String row;

    Seat(SeatType type, String row, int number) {
        this.seatType = type;
        this.bookingStatus = BookingStatus.AVAILABLE;
        this.row = row;
        seatID = row + String.format("%02d", number); 
    }

    public String getSeatID() {
        return seatID;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public String getRow() {
        return row;
    }

    public boolean isAvailable() {
        return bookingStatus == BookingStatus.AVAILABLE;
    }

    public boolean cancelBooking() {
        if (bookingStatus == BookingStatus.BOOKED) {
            bookingStatus = BookingStatus.AVAILABLE;
            return true;
        }
        return false;
    }

    public boolean bookSeat() {
        if (isAvailable()) {
            bookingStatus = BookingStatus.BOOKED;
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("Seat ID:%s, Type:%s, Row:%s, Price:%.2f, Status:%s",
                seatID, seatType, row, seatType.getPrice(), bookingStatus);
    }
}

enum SeatType {
    VIP(20.0), PREMIUM(15.0), REGULAR(10.0);

    private double price;

    SeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}   

enum BookingStatus {
    AVAILABLE, BOOKED
}