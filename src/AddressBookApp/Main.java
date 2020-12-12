package AddressBookApp;

public class Main {

    public static void main(String[] args) {

        Address addressContact1 = new Address("Street1", "Street11", "City1", "PostalCode1", "Province1", "Country1");
        Address addressContact2 = new Address("Street2", "Street22", "City2", "PostalCode2", "Province2", "Country2");

        MyDate date1 = new MyDate(11, 11, 11);
        MyDate date2 = new MyDate(22, 12, 22);

        Contact contact1 = new Contact("FirstName1", "LastName1", "911", "922", addressContact1, "111@gmail.com", date1, "empty");
        Contact contact2 = new Contact("FirstName2", "LastName2", "811", "822", addressContact2, "222@gmail.com", date2, "empty2");
        //same as contact1
        Contact contact3 = new Contact("FirstName1", "LastName1", "9111", "9222", addressContact1, "11111@gmail.com", date1, "empty");

        ContactService contactService = new ContactService();

        System.out.println("Check if list is empty:");
        contactService.printContacts();
        System.out.println(" ");


        contactService.addContact(contact1);
        contactService.addContact(contact2);
        System.out.println("Message about duplicated contact should appear.");
        contactService.addContact(contact3);
        System.out.println("");

        System.out.println("Check list after adding 3 contacts. Two contacts will be printed out.");
        contactService.printContacts();
        System.out.println("");

        System.out.println("Print from City1: ");
        contactService.printContactFromCity("City1");
        System.out.println("Print from City60: ");
        contactService.printContactFromCity("City60");
        System.out.println("");

        System.out.println("Print contact based on name: ");
        System.out.println(contactService.printContactBasedOnName("FirstName1", "LastName1"));
        System.out.println("");


        contactService.editContactFirstName(contact1, "NewName1");
        contactService.editContactLastName(contact1, "NewLastName1");

        contactService.editCity(contact1, "NewCity1");
        contactService.editStreetInfo1(contact1, "NewStreet1");
        System.out.println("Print contacts after some editing of Contact1.");
        contactService.printContacts();

    }
}
