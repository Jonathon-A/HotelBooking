package hotelbooking;

import java.io.IOException;
import java.util.Scanner;

public class HotelBooking {

    public static void main(String[] args) throws IOException, InterruptedException {
        start();
    }

    public static void start() throws IOException, InterruptedException {
        System.out.println("This program will calculate the price of your visit with or without our discount"
                + " (20% off the daily rate for each day you stay over 1 week) based on your selection of our services");
        chooseDays();
    }

    public static void chooseDays() throws IOException, InterruptedException {
        System.out.println("");
        System.out.println("Please enter how many days you would like to stay for:");

        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int days = input.nextInt();
            System.out.println("");
            System.out.println("You picked: " + days + " days");
            System.out.println("");
            chooseRoom(days);
        } else {
            System.out.println("Invalid Entry");
            System.out.println("");
            chooseDays();
        }
    }

    public static void chooseRoom(int days) throws IOException, InterruptedException {
        System.out.println("Please choose a room type:");
        System.out.println("1: Single - 1 Person  (£50)");
        System.out.println("2: Double - 2 Persons (£75)");
        System.out.println("3: Family - 4 Persons (£105)");
        int RoomPrice;
        Scanner input = new Scanner(System.in);
        int choose;
        if (input.hasNextInt()) {
            choose = input.nextInt();
        } else {
            choose = 100;
        }
        switch (choose) {
            case (1):
                System.out.println("");
                System.out.println("You picked: Single - 1 Person  (£50)");
                System.out.println("");
                RoomPrice = 50;
                chooseBoard(days, RoomPrice);
                break;
            case (2):
                System.out.println("");
                System.out.println("You picked: Double - 2 Persons (£75)");
                System.out.println("");
                RoomPrice = 75;
                chooseBoard(days, RoomPrice);
                break;
            case (3):
                System.out.println("");
                System.out.println("You picked: Family - 4 Persons (£105)");
                System.out.println("");
                RoomPrice = 105;
                chooseBoard(days, RoomPrice);
                break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                System.out.println("");
                chooseRoom(days);
                break;
        }
    }

    public static void chooseBoard(int days, int RoomPrice) throws IOException, InterruptedException {
        System.out.println("Please choose a board type");
        System.out.println("1: Self-Catering (£0)");
        System.out.println("2: Half-Board    (£10)");
        System.out.println("3: Full Board    (£20)");
        int BoardPrice;
        Scanner input = new Scanner(System.in);
        int choose;
        if (input.hasNextInt()) {
            choose = input.nextInt();
        } else {
            choose = 100;
        }
        switch (choose) {
            case (1):
                System.out.println("");
                System.out.println("You picked: Self-Catering (£0)");
                System.out.println("");
                BoardPrice = 0;
                CalculatorEnter(days, RoomPrice, BoardPrice);
                break;
            case (2):
                System.out.println("");
                System.out.println("You picked: Half-Board    (£10)");
                System.out.println("");
                BoardPrice = 10;
                CalculatorEnter(days, RoomPrice, BoardPrice);
                break;
            case (3):
                System.out.println("");
                System.out.println("You picked: Full Board    (£20)");
                System.out.println("");
                BoardPrice = 20;
                CalculatorEnter(days, RoomPrice, BoardPrice);
                break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                System.out.println("");
                chooseBoard(days, RoomPrice);
                break;
        }
    }

    public static void CalculatorEnter(int days, int RoomPrice, int BoardPrice) throws IOException, InterruptedException {
        HotelCalculator.setDays(days);
        HotelCalculator.setRoomPrice(RoomPrice);
        HotelCalculator.setBoardPrice(BoardPrice);
        CalculatorReturn();
    }

    public static void CalculatorReturn() throws IOException, InterruptedException {
        System.out.println("Calculating");
        System.out.println("Calculated");
        System.out.println("");
        System.out.println("Price without discount £" + HotelCalculator.getcalc());
        System.out.println("Price with discount £" + HotelCalculator.getcalcdiscount());
        again();
    }

    public static void again() throws IOException, InterruptedException {
        System.out.println("");
        System.out.println("Would you like to calculate the price of another visit?");
        System.out.println("1: Yes (Restart)");
        System.out.println("2: No  (Exit)");
        Scanner input = new Scanner(System.in);
        int choose;
        if (input.hasNextInt()) {
            choose = input.nextInt();
        } else {
            choose = 100;
        }
        switch (choose) {
            case (1):
                System.out.println("");
                System.out.println("You picked: Yes (Restart)");
                System.out.println("Restarting");
                System.out.println("");
                start();
                break;
            case (2):
                System.out.println("");
                System.out.println("You picked: No  (Exit)");
                System.out.println("Exiting");
                System.out.println("");
                break;

            default:
                System.out.println("");
                System.out.println("Invalid choice");
                System.out.println("");
                again();
                break;
        }
    }
}
