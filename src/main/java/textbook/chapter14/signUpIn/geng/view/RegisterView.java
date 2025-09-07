package textbook.chapter14.signUpIn.geng.view;

import textbook.chapter14.signUpIn.geng.handle.*;
import textbook.chapter14.signUpIn.geng.model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JPanel implements ActionListener {
    Register register;
    JTextField inputID, inputBirth;
    JPasswordField inputPassword;
    JButton buttonRegister;

    RegisterView() {
        register = new Register();
        inputID = new JTextField(12);
        inputPassword = new JPasswordField(12);
        inputBirth = new JTextField(12);
        buttonRegister = new JButton("注册");
        add(new JLabel("ID:"));
        add(inputID);
        add(new JLabel("密码:"));
        add(inputPassword);
        add(new JLabel("出生日期(****-**-**):"));
        add(inputBirth);
        add(buttonRegister);
        buttonRegister.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        register.setID(inputID.getText());
        char[] pw = inputPassword.getPassword();
        register.setPassword(new String(pw));
        register.setBirth(inputBirth.getText());
        HandleRegister handleRegister = new HandleRegister();
        handleRegister.writeRegisterModel(register);
    }
}
