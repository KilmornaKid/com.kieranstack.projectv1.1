import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    public GUI() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        JButton jbutton = new JButton("login");
        jbutton.addActionListener((ActionEvent e)->
            {
            JOptionPane.showMessageDialog(null,"hello");
        });

        Container jpane = getContentPane();
        jpane.add(jbutton);
    }




}
