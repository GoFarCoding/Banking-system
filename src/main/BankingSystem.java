package main;

import dao.CustomerDAO;
import model.Customer;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomerDAO customerDAO = new CustomerDAO();

        System.out.println("=== BANKING SYSTEM ===");

        System.out.print("Enter Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(id, firstName, lastName, email);

        customerDAO.addCustomer(customer);

        scanner.close();
    }
}
