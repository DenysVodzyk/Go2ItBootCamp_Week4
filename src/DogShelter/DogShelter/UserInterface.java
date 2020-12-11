package DogShelter;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner;
    private static DogShelterService dogShelter;
    private static boolean exitProgram;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.dogShelter = new DogShelterService();
        this.exitProgram = true;
    }

    public static String getUserInputString() {
        return scanner.next();
    }

    public static int getUserInputInt() {
        return scanner.nextInt();
    }

    public static double getUserInputDouble() {
        return scanner.nextDouble();
    }

    public static char getUserInputChar() {
        return scanner.next().charAt(0);
    }

    public static void runUserInterface() {
        while (exitProgram) {
            printMenuOptions();
            int menuButton = getUserInputInt();
            runSwitchCase(menuButton);
        }
    }

    public static void printMenuOptions() {
        System.out.println("------------------------------------");
        System.out.println("1. Add dog");
        System.out.println("2. View all dogs");
        System.out.println("3. View all available dogs");
        System.out.println("4. View dog");
        System.out.println("5. Update dog home status");
        System.out.println("6. Exit");
        System.out.println("------------------------------------");
        System.out.println("Choose the operation: ");
    }

    public static void runSwitchCase(int menuButton) {
        switch (menuButton) {
            case 1:
                System.out.print("Dog name: ");
                String name = getUserInputString();
                System.out.print("Dog id: ");
                int id = getUserInputInt();
                System.out.print("Dog breed: ");
                String breed = getUserInputString();
                System.out.print("Dog sex: ");
                char sex = getUserInputChar();
                System.out.print("Dog age: ");
                double age = getUserInputDouble();
                Dog dog = new Dog(id, name, breed, sex, age);
                dogShelter.addDog(dog);
                break;
            case 2:
                System.out.println(dogShelter.getDogs());
                // dogShelter.viewAllDogs();
                break;
            case 3:
                dogShelter.viewAllAvailableDogs();
                break;
            case 4:
                System.out.print("Enter dog id: ");
                int searchId = getUserInputInt();
                System.out.println(dogShelter.viewDogById(searchId));
                break;
            case 5:
                System.out.print("Enter dog id: ");
                int searchIdUpdate = getUserInputInt();
                boolean dogFound = dogShelter.updateDogStatus(searchIdUpdate);
                if (!dogFound) {
                    System.out.println("There is no dog with id: " + searchIdUpdate);
                }
                break;
            case 6:
                System.out.println("Exit");
                exitProgram = false;
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
}
