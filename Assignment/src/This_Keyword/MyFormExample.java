import javax.swing.*;
import java.awt.event.*;

public class MyFormExample extends JFrame implements ActionListener {
    JButton button;

    public MyFormExample() {
        button = new JButton("Click Me");
        button.addActionListener(this);
        add(button);
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new MyFormExample();
    }
}
