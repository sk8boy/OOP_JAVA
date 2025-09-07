package textbook.chapter14.signUpIn.geng.handle;

import textbook.chapter14.signUpIn.geng.model.Login;

import javax.swing.*;
import java.sql.*;

public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;

    public HandleLogin() {
        try {  //加载JDBC-MySQL8.0.15连接器:
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
        String uri = "jdbc:mysql://localhost:3306/user?" +
                "useSSL=false&serverTimezone=CST&characterEncoding=utf-8";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(uri, "root", ""); //连接代码
        } catch (SQLException e) {
        }
    }

    public Login queryVerify(Login loginModel) {
        String id = loginModel.getID();
        String pw = loginModel.getPassword();
        String sqlStr = "select id,password from register where " +
                "id = ? and password = ?";
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, id);
            preSql.setString(2, pw);
            rs = preSql.executeQuery();
            if (rs.next()) {
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null, "登录成功",
                        "恭喜", JOptionPane.WARNING_MESSAGE);
            } else {
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "登录失败",
                        "登录失败，重新登录", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (SQLException e) {
        }
        return loginModel;
    }
}
