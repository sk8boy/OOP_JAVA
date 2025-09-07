package textbook.chapter14.example3;

import textbook.chapter14.example2.GetDBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example14_3 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBConnection.connectDB("Book", "root", "");
        String SQL = "select * from bookList " +
                "where year(chubanDate) between 1999 and 2021 and price>=30 " +
                " order by price";
        if (con == null) return;
        try {
            sql = con.createStatement();
            rs = sql.executeQuery(SQL);
            while (rs.next()) {
                String ISBN = rs.getString(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                String date = rs.getString(4);
                System.out.printf("%s,%s,%s,%s.\n", ISBN, name, price, date);
            }
            con.close();
        } catch (SQLException e) {
        }
    }
}
