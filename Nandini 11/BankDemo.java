import java.util.Scanner;

interface Bank {
    void showBankName();
}

class Customer {
    String name;

    void getCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
    }
}

class Account extends Customer implements Bank {
    int accNo;
    double balance;

    void getAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNo = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void showBankName() {
        System.out.println("Bank: ABC Bank");
    }

    void display() {
        showBankName();
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account a = new Account();
        a.getCustomer();
        a.getAccount();
        a.display();
    }
}