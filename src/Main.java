import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {

    private static void printBookings(List<Booking> list) {
        for (Booking booking : list) {
            String result = "From " + booking.getCheckIn();
            result += " to " + booking.getCheckOut() + " ";
            result += booking.getGuests().get(0).getName() + " " + booking.getGuests().get(0).getSurname();
            result += " (" + booking.getGuests().get(0).getBirthDate() + ") ";
            result += "[" + booking.getGuests().size() + ", " + booking.getRoom().isHasSeaView() + "] ";
            result += "for " + booking.getTotalBookingPrice(booking) + " CZK";
            System.out.println(result);
        }
    }

    public static void main(String[] args) {

        Guest firstGuest = new Guest("Ella", "Jones", LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("John", "Green", LocalDate.of(1995, 5, 5));

        Room roomOne = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room roomTwo = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        Room roomThree = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

        Booking firstBooking = new Booking (List.of(firstGuest), roomOne, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.BUSINESS);
        Booking secondBooking = new Booking(List.of(firstGuest, secondGuest), roomThree, LocalDate.of(2021, 9,1), LocalDate.of(2021, 9, 14), TypeOfVacation.LEISURE);
        Booking thirdBooking = new Booking(List.of(secondGuest), roomOne);

        System.out.println(firstGuest.getDescription());

        BookingManager listOfBookings = new BookingManager();

        listOfBookings.addBooking(firstBooking);
        listOfBookings.addBooking(secondBooking);
        listOfBookings.addBooking(thirdBooking);

        Guest thirdGuest = new Guest("Carlos", "Marco", LocalDate.of(1990, 5, 15));
        listOfBookings.addBooking(new Booking(List.of(thirdGuest), roomThree, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), TypeOfVacation.BUSINESS));

        Guest fourthGuest = new Guest ("Carlos", "Marko", LocalDate.of(1979, 3, 1));
        listOfBookings.addBooking(new Booking(List.of(fourthGuest), roomTwo, LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), TypeOfVacation.LEISURE));

        Guest fifthGuest = new Guest("Caroline", "Dark", LocalDate.of(1994, 9, 2));
        for (int i = 0; i <= 28; i++) {
            LocalDate checkInDate = LocalDate.of(2023, 6, 1);
            LocalDate checkOutDate = LocalDate.of(2023, 6, 2);
            listOfBookings.addBooking(new Booking(List.of(fifthGuest), roomTwo, checkInDate.plusDays(i), checkOutDate.plusDays(i), TypeOfVacation.LEISURE));
        }

        for (int i = 0; i <= 22; i+=7) {
            LocalDate checkInDate = LocalDate.of(2023, 8, 1);
            LocalDate checkOutDate = LocalDate.of(2023, 8, 4);
            listOfBookings.addBooking(new Booking (List.of(fifthGuest), roomTwo, checkInDate.plusDays(i), checkOutDate.plusDays(i), TypeOfVacation.LEISURE));
        }

        printBookings(listOfBookings.getBookings());

        listOfBookings.getFirstEightLeisureBookings();
    }
}