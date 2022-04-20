package com.clProject.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**
     * Create a jdbc connection using the url, username, password
     *
     */
    public static void createConnection() {
        String url = Environment.DB_URL;
        String username = Environment.DB_USERNAME;
        String password = Environment.DB_PASSWORD;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Close existing jdbc connection, destroy the Statement, ResultSet objects
     */
    public static void destroyConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static Map<String, Object> getRowMap(String query) {
        return getQueryResultMap(query).get(0);
    }
    public static List<Map<String, Object>> getQueryResultMap(String query) {
        executeQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;

        try {
            rsmd = resultSet.getMetaData();

            while (resultSet.next()) {

                Map<String, Object> colNameValueMap = new HashMap<>();

                for (int i = 1; i <= rsmd.getColumnCount(); i++) {

                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }

                rowList.add(colNameValueMap);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rowList;

    }


    private static void executeQuery(String query) {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
