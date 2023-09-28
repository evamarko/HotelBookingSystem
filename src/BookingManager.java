import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    public Booking getBooking(int index) {
        return bookings.get(index);
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }

    public void clearBookings() {
        bookings.clear();
    }

    @Override
    public String toString() {
        return "BookingManager{" +
                "bookings=" + bookings +
                '}';
    }

    public int getNumberOfBookings() {
        return bookings.size();
    }

    public int getNumberOfBusinessBookings() {
        int result = 0;
        for (Booking booking : bookings) {
            if (booking.getTypeOfVacation().equals(TypeOfVacation.BUSINESS)) {
                result++;
            }
        }
        return result;
    }

    public double getAverageGuests() {
        int totalNumOfGuests = 0;
        for (Booking booking : bookings) {
            totalNumOfGuests += booking.getGuests().size();
        }
        return (double) totalNumOfGuests/getNumberOfBookings();
    }

    public void getFirstEightLeisureBookings() {
        int numOfLeisureBookings = 0;
        for (Booking booking : bookings) {if (booking.getTypeOfVacation().equals(TypeOfVacation.LEISURE)) {
            System.out.println(booking);
            numOfLeisureBookings++;
            if (numOfLeisureBookings >= 8) {
                break;
                }
            }
        }
    }
}
