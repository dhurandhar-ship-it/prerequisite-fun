import java.util.Scanner;

public class SalesmanCustomers {
    public static void printCustomers(String salesman, String[] customers){
        System.out.println("\nSalesman Name: " + salesman);
        System.out.println("Customers' List: ");
        for(int i = 0; i < customers.length; i++){
            System.out.println((i + 1) + ". " + customers[i]);
        }
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Read salesman's name
        System.out.println("Enter Salesman's name: ");
        String salesman = sc.nextLine();
        // Read number of customers
        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        // Array to store customers
        String[] customers = new String[n];
        System.out.println("Enter Customer's Names: ");
        for(int i = 0; i < n; i++){
            customers[i] = sc.nextLine();
        }
        SalesmanCustomers.printCustomers(salesman, customers);
        sc.close();
    }