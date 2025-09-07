package textbook.chapter12.example15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WindowClone extends JFrame implements ActionListener {
    JTextArea text = null;
    JButton button;

    WindowClone() {
        setLayout(new FlowLayout());
        text = new JTextArea(5, 8);
        button = new JButton("得到文本区的克隆");
        button.addActionListener(this);
        setVisible(true);
        add(new JScrollPane(text));
        add(button);
        setSize(580, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(text);
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objectIn = new ObjectInputStream(in);
            JTextArea cloneText = (JTextArea) objectIn.readObject();
            cloneText.setBackground(Color.pink);
            this.add(new JScrollPane(cloneText));
            this.validate();
        } catch (Exception exp) {
        }
    }
}


