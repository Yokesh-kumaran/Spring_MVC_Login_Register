package com.springmvc.dao;

import com.springmvc.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class RegisterDao {
    public boolean registerUser(String email, String name, String password) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            try {
                String query = "INSERT INTO user (emailid, name, password) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, password);

                int rowsInserted = preparedStatement.executeUpdate();
                preparedStatement.close();

                return rowsInserted > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
