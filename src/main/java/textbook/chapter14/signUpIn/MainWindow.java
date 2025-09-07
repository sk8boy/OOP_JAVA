package textbook.chapter14.signUpIn;

import textbook.chapter14.signUpIn.geng.view.RegisterAndLoginView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    JButton computerButton;
    RegisterAndLoginView view;

    MainWindow() {
        setBounds(100, 100, 800, 260);
        view = new RegisterAndLoginView();
        computerButton = new JButton("玩猜数字");
        computerButton.addActionListener(this);
        add(view, BorderLayout.CENTER);
        add(computerButton, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!view.isLoginSuccess()) {
            JOptionPane.showMessageDialog(null, "请登录", "登录提示",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            WindowGuessNumber win = new WindowGuessNumber();
            win.setTitle("猜数字");
        }
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setTitle("登录后玩猜数字游戏");
    }
}
