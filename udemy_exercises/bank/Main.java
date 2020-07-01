package udemy_exercises.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Harris Bank NA");
        if (bank.addBranch("Chicago")){
            System.out.println("Branch Chicago created");
        }
        //bank.addBranch("Chicago");
        bank.addCustomer("Chicago", "Vimala", 1000.00);
        bank.addCustomer("Chicago", "Vance", 100.10);

        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Nive", 800.00);

        bank.addCustomer("Dallas", "Meethu", 100.00);
        bank.addCustomerTransaction("Dallas","Meethu",810.20);
        bank.addCustomerTransaction("Dallas", "Vamsi", 20.50);

        bank.listCustomer("Dallas", true);

        bank.addBranch("Chennai");

        if (!bank.addCustomer("Chennai","Kala",12.35)){
            System.out.println("Branch does not exist");
        }
        if (!bank.addBranch("Chennai")){
            System.out.println("Branch already exists");
        }
        if(!bank.addCustomerTransaction("Chennai","Sunny", 115.15)){
            System.out.println("Customer doesnt exist");;
        }
        if (!bank.addCustomer("Dallas", "Meethu", 100.10)){
            System.out.println("Customer already exists");
        }
    }
}
