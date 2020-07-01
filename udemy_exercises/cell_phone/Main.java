package udemy_exercises.cell_phone;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("875 440 9803");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter your option ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new Contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (cellPhone.addNewContact(newContact)){
            System.out.println("New Contact added. name = " +name + ", phone = " +phone);
        }
        else {
            System.out.println(name +" already exists..");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found..");
            return;
        }
        System.out.println("Enter new contact : ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (cellPhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Record Updated... ");
        }
        else {
            System.out.println("Error updating");
        }
    }

    private static void removeContact(){
        System.out.println("Enter existing contact : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found ");
            return;
        }
        if (cellPhone.removeContact(existingContactRecord)){
            System.out.println("Contact deleted..");
        }
        else {
            System.out.println("Unable to delete contact");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found ");
            return;
        }
        System.out.println("Name : " +existingContactRecord.getName()+ " phone number : " +existingContactRecord.getPhoneNum());
    }

    private static void startPhone(){
        System.out.println("Switching on ..");
    }
    private static void printActions(){
        System.out.println("Options");
        System.out.println("0 - Shutdown\n" +
                "1 - Print Contacts\n" +
                "2 - Add contacts\n" +
                "3 - Update Contacts\n" +
                "4 - Delete Contacts\n" +
                "5 - Search Contacts \n" +
                "6 - Options");
        System.out.println("Choose your Option : ");
    }
}
