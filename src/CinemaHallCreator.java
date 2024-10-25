class CinemaHallCreator {

    static void createNewCinemaHall(int rows, int seats) {
        System.out.println("Cinema: ");
        for (int i = 0; i <= seats; i++) {
            if (i == 0) {
                System.out.printf("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.printf(i + " ");
            for (int j = 1; j <= seats; j++) {
                System.out.print("S" + " ");
            }
            System.out.println();
        }
    }
}
