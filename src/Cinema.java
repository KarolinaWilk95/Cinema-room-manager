import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        CinemaHall cinemaHall;

        try (Scanner scanner = new Scanner(System.in)) {
            // --------------------------------------------
            System.out.println("Please type how many rows and how many in one row you need:");
            int rows = scanner.nextInt();
            int seats = scanner.nextInt();
            cinemaHall = new CinemaHall(rows, seats);
            System.out.println(cinemaHall);
            cinemaHall.createNewCinemaHall();
            // --------------------------------------------


            System.out.println("Type how much seats you want to reserve. Next type symbol of seat");
            int seatsToReserve = scanner.nextInt();
            List<String> reservedSeats = new ArrayList<>(seatsToReserve);
            while (seatsToReserve != reservedSeats.size()) {
                try {
                    String nextSeat = scanner.next().toUpperCase();
                    cinemaHall.reserveSeat(nextSeat);
                    reservedSeats.add(nextSeat);
                } catch (IllegalArgumentException e) {
                    System.out.println("You choose seat out of range");
                }
            }
            System.out.println("You successfully reserved seats: " + reservedSeats);


//        --------------------------------------------
            System.out.println("Type your base ticket price: ");
            double ticketPrice = scanner.nextDouble();
            System.out.println(cinemaHall.calculateIncome(ticketPrice) + "$");

        }
    }

}
