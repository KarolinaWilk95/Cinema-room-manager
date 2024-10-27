import java.util.Map;
import java.util.TreeMap;

public class CinemaHall {
    int rows;
    int seats;
    char c = 64;
    Map<String, String> cinemaHallSeats = new TreeMap<>();

    public CinemaHall(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
    }

    void createNewCinemaHall() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= seats; j++) {
                cinemaHallSeats.put(i + Character.toString(c + j), "");
            }
        }
        System.out.println(cinemaHallSeats);
    }

    public double calculateIncome(double ticketPrice) {
        double income;
        int reservedSeats = 0;
        for (String cinemaSeat : cinemaHallSeats.values()) {
            if (cinemaSeat.equals("X")) {
                reservedSeats++;
            }
        }

        if (reservedSeats > 60) {
            income = reservedSeats * (0.75 * ticketPrice);
        } else {
            income = reservedSeats * ticketPrice;
        }
        return income;
    }

    public void reserveSeat(String nextSeat) {
        if (!cinemaHallSeats.containsKey(nextSeat)) {
            throw new IllegalArgumentException();
        }
        cinemaHallSeats.put(nextSeat, "X");
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Cinema: ");
        sb.append("\n");
        for (int i = 0; i <= seats; i++) {
            if (i == 0) {
                sb.append("  ");
            } else {
                sb.append(Character.toString(c + i));
                sb.append(" ");
            }
        }
        sb.append("\n");
        for (int i = 1; i <= rows; i++) {
            sb.append(i);
            sb.append(" ");
            for (int j = 1; j <= seats; j++) {
                sb.append("S");
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
