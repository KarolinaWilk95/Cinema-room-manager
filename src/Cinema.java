import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        System.out.println("Hello! Welcome in cinema seats manager. \n" +
                "Choose what You want to do: \n" +
                "1. Create new cinema hall \n" +
                "2. Reserve seats \n" +
                "3. ");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please type how many rows and how many in one row you need:");
                    int rows = scanner.nextInt();
                    int seats = scanner.nextInt();
                    CinemaHallCreator.createNewCinemaHall(rows, seats);
                    break;
                case 2:
                    System.out.println("Wait...");
                    break;
                default:
                    System.out.println("Are you sure, that you choose right?");
            }
        }
    }
}