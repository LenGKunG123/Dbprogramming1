package dbprogramming1;

import java.sql.*;

public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student(studentID ,firstName,lastName,email,deptID)" + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"Mark");
            preparedStatement.setString(3,"Ozone");
            preparedStatement.setString(4,"AAAA@gmail.com");
            preparedStatement.setString(5,"IT");
        preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
