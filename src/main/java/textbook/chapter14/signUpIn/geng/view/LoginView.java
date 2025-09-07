package textbook.chapter14.signUpIn.geng.view;

import textbook.chapter14.signUpIn.geng.handle.*;
import textbook.chapter14.signUpIn.geng.model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JPanel implements ActionListener {
    Login login;
    JTextField inputID;
    JPasswordField inputPassword;
    JButton buttonLogin;
    boolean loginSuccess;

    LoginView() {
        login = new Login();
        inputID = new JTextField(12);
        inputPassword = new JPasswordField(12);
        buttonLogin = new JButton("登录");
        add(new JLabel("ID:"));
        add(inputID);
        add(new JLabel("密码:"));
        add(inputPassword);
        add(buttonLogin);
        buttonLogin.addActionListener(this);
    }

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void actionPerformed(ActionEvent e) {
        login.setID(inputID.getText());
        char[] pw = inputPassword.getPassword();
        login.setPassword(new String(pw));
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        loginSuccess = login.getLoginSuccess();
    }
}
