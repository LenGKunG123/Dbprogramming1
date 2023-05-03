package dbprogramming1;

import java.sql.*;

public class LAB15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData= results.getMetaData();
            System.out.println(rsMetaData.getColumnCount());

            for (int i = 1; i <= rsMetaData.getColumnCount() ; i++) {
                System.out.println(rsMetaData.getColumnName(i));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
