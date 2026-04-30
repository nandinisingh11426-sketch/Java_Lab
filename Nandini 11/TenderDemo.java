import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        company = sc.nextLine();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
        sc.nextLine();
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            t[i].input();
        }

        double min = t[0].cost;
        String minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("\nCompany with minimum cost: " + minCompany);
        System.out.println("Minimum Cost: " + min);
    }
}