import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest firstGuest = new Guest("Ella", "Jones", LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("John", "Green", LocalDate.of(1995, 5, 5));
        System.out.println(firstGuest);
        System.out.println(secondGuest);

        Room roomOne = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room roomTwo = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        Room roomThree = new Room(3, 3, false, true, BigDecimal.valueOf(2400));
        System.out.println(roomOne);
        System.out.println(roomTwo);
        System.out.println(roomThree);

        Booking firstBooking = new Booking (List.of(firstGuest), roomOne, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.BUSINESS);
        Booking secondBooking = new Booking(List.of(firstGuest, secondGuest), roomThree, LocalDate.of(2021, 9,1), LocalDate.of(2021, 9, 14), TypeOfVacation.LEISURE);
        System.out.println(firstBooking);
        System.out.println(secondBooking);




    }
}