package dao;

import database.DBConnection;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {

    public void addCustomer(Customer customer) {

        String sql = "INSERT INTO customers(customer_id, first_name, last_name, email) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, customer.getCustomerId());
            stmt.setString(2, customer.getFirstName());
            stmt.setString(3, customer.getLastName());
            stmt.setString(4, customer.getEmail());

            stmt.executeUpdate();

            System.out.println("Customer added successfully.");

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
