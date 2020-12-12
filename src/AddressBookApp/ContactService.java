package AddressBookApp;

import java.util.ArrayList;

public class ContactService {
    private ArrayList<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        } else {
            System.out.println("This contact already exists.");
        }
    }

    public void deleteContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
        } else {
            System.out.println("Contact is not found.");
        }
    }

    public void editContactFirstName(Contact contact, String newFirstName) {
        contact.setFirstName(newFirstName);
    }

    public void editContactLastName(Contact contact, String newLastName) {
        contact.setLastName(newLastName);
    }

    public void editContactHomePhone(Contact contact, String newHomePhone) {
        contact.setHomePhone(newHomePhone);
    }

    public void editContactWorkPhone(Contact contact, String newWorkPhone) {
        contact.setWorkPhone(newWorkPhone);
    }

    public void editStreetInfo1(Contact contact, String newStreetInfo1) {
        contact.getHomeAddress().streetInfo1 = newStreetInfo1;
    }

    public void editStreetInfo2(Contact contact, String newStreetInfo2) {
        contact.getHomeAddress().streetInfo2 = newStreetInfo2;
    }

    public void editCity(Contact contact, String newCity) {
        contact.getHomeAddress().city = newCity;
    }

    public void editPostalCode(Contact contact, String newPostalCode) {
        contact.getHomeAddress().postalCode = newPostalCode;
    }

    public void editProvince(Contact contact, String newProvince) {
        contact.getHomeAddress().province = newProvince;
    }

    public void editCountry(Contact contact, String newCountry) {
        contact.getHomeAddress().country = newCountry;
    }

    public void editEmail(Contact contact, String newEmail) {
        contact.setEmail(newEmail);
    }

    public void editDay(Contact contact, int newDay) {
        contact.getBirthday().setDay(newDay);
    }

    public void editMonth(Contact contact, int newMonth) {
        contact.getBirthday().setMonth(newMonth);
    }

    public void editYear(Contact contact, int newYear) {
        contact.getBirthday().setMonth(newYear);
    }

    public void editNotes(Contact contact, String newNotes) {
        contact.setNotes(newNotes);
    }

    public void printContactFromCity(String city) {
        boolean isFound = false;
        for (Contact contact : contacts) {
            String contactCity = contact.getHomeAddress().city;
            if (contactCity.equals(city)) {
                System.out.println(contact);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Nobody lives in " + city + " among your contacts.");
        }
    }

    public String printContactBasedOnName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            String contactFirstName = contact.getFirstName();
            String contactLastName = contact.getLastName();
            if (contactFirstName.equals(firstName) && contactLastName.equals(lastName)) {
                return contact.toString();
            }
        }
        return "Contact is not found.";
    }

    public void printContacts() {
        System.out.println(contacts);
    }

}