package DogShelter;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.runUserInterface();
    }
}




//
//
//        Dog one = new Dog(111, "one", "oneBreed", 'f', 12);
//        Dog two = new Dog(111, "one", "oneBreed", 'f', 20);
//        Dog three = new Dog(111, "one", "oneBreed", 'f', 0);
//
//        DogShelterFunctionality dogShelterFunctionality = new DogShelterFunctionality();
//        three.setHasFoundHome(true);
//
//        dogShelterFunctionality.addDog(one);
//        dogShelterFunctionality.addDog(two);
//        dogShelterFunctionality.addDog(three);
//
//
//        dogShelterFunctionality.viewAllDogs();
//        System.out.println("");
//        System.out.println("");
//        dogShelterFunctionality.viewAllAvailableDogs();


//
//        Dog one = new Dog(111, "one", "oneBreed", 'f', 12);
//        Dog two = new Dog(111, "one", "oneBreed", 'f', 20);
//        Dog three = new Dog(111, "one", "oneBreed", 'f', 0);
//
//        DogShelterFunctionality dogShelterFunctionality = new DogShelterFunctionality();
//        three.setHasFoundHome(true);
//
//        dogShelterFunctionality.addDog(one);
//        dogShelterFunctionality.addDog(two);
//        dogShelterFunctionality.addDog(three);
//
//
//        dogShelterFunctionality.viewAllDogs();
//        System.out.println("");
//        System.out.println("");
//        dogShelterFunctionality.viewAllAvailableDogs();
//
//    }
//
//
//    }

//        Scanner scanner = new Scanner(System.in);
//        DogShelterFunctionality dogShelter = new DogShelterFunctionality();
//        boolean quit = true;
//
//        while (quit) {
//            System.out.println("------------------------------------");
//            System.out.println("1. Add dog");
//            System.out.println("2. View all dogs");
//            System.out.println("3. View all available dogs");
//            System.out.println("4. View dog");
//            System.out.println("5. Update dog home status");
//            System.out.println("6. Exit");
//            System.out.println("------------------------------------");
//            System.out.println("Choose the operation: ");
//
//            int operation = scanner.nextInt();
//            switch (operation) {
//                case 1:
//                    System.out.print("Dog name: ");
//                    String name = scanner.next();
//                    System.out.print("Dog id: ");
//                    int id = scanner.nextInt();
//                    System.out.print("Dog breed: ");
//                    String breed = scanner.next();
//                    System.out.print("Dog sex: ");
//                    char sex = scanner.next().charAt(0);
//                    System.out.print("Dog age: ");
//                    double age = scanner.nextDouble();
//                    Dog dog = new Dog(id, name, breed, sex, age);
//                    dogShelter.addDog(dog);
//                    break;
//                case 2:
//                    dogShelter.viewAllDogs();
//                    break;
//                case 3:
//                    dogShelter.viewAllAvailableDogs();
//                    break;
//                case 4:
//                    System.out.print("Enter dog id: ");
//                    int searchId = scanner.nextInt();
//                    dogShelter.viewDogById(searchId);
//                    break;
//                case 5:
//                    System.out.print("Enter dog id: ");
//                    int searchIdUpdate = scanner.nextInt();
//                    dogShelter.updateDogStatus(searchIdUpdate);
//                    break;
//                case 6:
//                    System.out.println("Exit");
//                    quit = false;
//                    break;
//                default:
//                    System.out.println("Unknown command");
//                    break;
//
//            }
//        }
//    }
//}