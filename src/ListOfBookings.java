import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }
}
