package com.springmvc.dao;

import com.springmvc.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HomeDao {
    public List<Map<String, Object>> getUserDataList() {
        List<Map<String, Object>> userDataList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                String query = "SELECT name, emailid, password FROM user";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                     ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("emailid");
                        String password = resultSet.getString("password");

                        Map<String, Object> userData = new HashMap<>();
                        userData.put("name", name);
                        userData.put("email", email);
                        userData.put("password", password);
                        userDataList.add(userData);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userDataList;
    }
}
