package DogShelter;

import java.util.ArrayList;
import java.util.List;

public class DogShelterService {
    private List<Dog> dogs;

    public DogShelterService() {
        this.dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        if (dogs.contains(dog)) {
            System.out.println("Dog with id: " + dog.getId() + " is already int the list.");
        } else {
            dogs.add(dog);
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void viewAllAvailableDogs() {
        for (Dog dog : dogs) {
            if (!dog.isHasFoundHome()) {
                System.out.println(dog);
            }
        }
    }

    public String viewDogById(int id) {
        for (Dog dog : dogs) {
            if (dog.getId() == id) {
                return "" + dog;
            }
        }
        return "There is no dog with id: " + id;
    }

    public boolean updateDogStatus(int id) {
        for (Dog dog : dogs) {
            if (dog.getId() == id) {
                dog.setHasFoundHome(true);
                return true;
            }
        }
        return false;
    }
}