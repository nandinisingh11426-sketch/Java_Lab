import java.util.Scanner;

interface SalesDepartment {
    void processSale();
}

interface FinanceDepartment {
    void generateInvoice();
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double amount;

    public void processSale() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sale amount: ");
        amount = sc.nextDouble();
        System.out.println("Sale processed successfully for amount: " + amount);
    }

    public void generateInvoice() {
        System.out.println("Invoice generated for amount: " + amount);
    }

    void showSummary() {
        System.out.println("\n--- Summary ---");
        System.out.println("Total Sale Amount: " + amount);
        System.out.println("All tasks handled by Commercial Executive");
    }
}

public class ExecutiveDemo {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();
        ce.processSale();
        ce.generateInvoice();
        ce.showSummary();
    }
}