import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private TypeOfVacation typeOfVacation;

    public Booking(List<Guest> guests, Room room, LocalDate checkIn, LocalDate checkOut, TypeOfVacation typeOfVacation) {
        this.guests = guests;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(List<Guest> guests, Room room) {
        this.guests = guests;
        this.room = room;
        this.checkIn = LocalDate.now();
        this.checkOut = LocalDate.now().plusDays(6);
        this.typeOfVacation = TypeOfVacation.LEISURE;
    }

    public List<Guest> getGuests() {
        return new ArrayList<>(guests);
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", room=" + room +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", typeOfVacation=" + typeOfVacation +
                '}';
    }
}
