package udemy_exercises.cell_phone;

public class Contact{
    String name;
    String phoneNum;

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static Contact createContact(String name, String phoneNum){
        return new Contact(name,phoneNum);
    }
}