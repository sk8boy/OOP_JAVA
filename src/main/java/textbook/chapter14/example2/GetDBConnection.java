package textbook.chapter14.example2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDBConnection {
    public static Connection connectDB(String DBName, String id, String password) {
        try {  //加载JDBC-MySQL8.0连接器:
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
        Connection con = null;
        String uri = "jdbc:mysql://localhost:3306/" + DBName + "?" +
                "useSSL=false&serverTimezone=CST&characterEncoding=utf-8";
        try {
            con = DriverManager.getConnection(uri, id, password); //连接
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
