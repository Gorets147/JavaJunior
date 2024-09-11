package org.example.lesson4;

import java.sql.*;

public class Db {
    private static final String url = "jdbc:mysql://localhost:3306";
    private static final String user = "root";
    private static final String password = "1234";



    public static void main(String[] args) {
        DbAction dbAction = new DbAction();

        try(Connection conn = dbAction.getConnection(url, user, password)){
            Statement stmt = conn.createStatement();
            stmt.execute("DROP SCHEMA test");
            stmt.execute("CREATE SCHEMA test ;");
            stmt.execute("USE test");
            stmt.execute("CREATE TABLE IF NOT EXISTS test \n(" +
                    " id INT NOT NULL,\n" +
                    " firstname VARCHAR(45) NULL,\n" +
                    " lastname VARCHAR(45) NULL,\n" +
                    " PRIMARY KEY (id));");
            stmt.execute("INSERT INTO test (id, firstname, lastname)\n " +
                    "VALUES (1, 'John', 'Smith');");
            stmt.execute("INSERT INTO test (id, firstname, lastname)\n " +
                    "VALUES (2, 'Petr', 'First');");

            dbAction.getData(stmt);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }




}
