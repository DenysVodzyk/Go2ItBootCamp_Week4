package DogShelter;

import java.util.Objects;

public class Dog {
    private int id;
    private String name;
    private double age;
    private String breed;
    private char sex;
    private boolean hasFoundHome;

    public Dog(int id, String name, String breed, char sex, double age) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hasFoundHome = false;
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = validateAge(age);
    }

    public double validateAge(double age) {
        double validAge = age;
        while (true) {
            if (validAge >= 0 && validAge <= 25) {
                break;
            }
            System.out.println("Please double check the birthdate of the dog, " + getName() +
                    ". Age cannot be less than 0 or higher than 25.");
            System.out.print("Enter new age for dog " + getName() + ": ");
            validAge = UserInterface.getUserInputDouble();
        }
        return validAge;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isHasFoundHome() {
        return hasFoundHome;
    }

    public void setHasFoundHome(boolean hasFoundHome) {
        this.hasFoundHome = hasFoundHome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id == dog.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", breed='" + getBreed() + '\'' +
                ", sex=" + getSex() +
                ", hasFoundHome=" + isHasFoundHome() +
                '}' + "\n";
    }
}


//            System.out.println("Please double check the birthdate of the dog, " + getName() +
//                    ". Age cannot be less than 0 or higher than 25.");
//            System.out.print("Enter new age for dog " + getName() + ": ");

//    public double getUserInputInt() {
//        Scanner input = new Scanner(System.in);
//        double age = input.nextInt();
//        return age;
//    }