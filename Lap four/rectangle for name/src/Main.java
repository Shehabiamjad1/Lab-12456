//program to creating Square and print name in it
import javax.swing.*;
import java.awt.*;
//graphics libraries

public class Main {

    static class Myname extends JFrame{  // new class inherited from JFrame class
        Myname(){
            JLabel name1 = new JLabel();
            name1.setText("Mahfoodh");
            name1.setHorizontalAlignment(JLabel.CENTER);      // Lable to format the frame contents
            name1.setVerticalAlignment(JLabel.CENTER);
            name1.setForeground(Color.red);


            JFrame name = new JFrame();
           this.setVisible(true);
           this.setSize(400, 400);
           this.setResizable(true);                 // frame contents
           this.setTitle("name");
           this.getContentPane().setBackground(new Color(0x1818D7));
           this.add(name1);
        }
    }
    public static void main(String[] args) {

        new Myname  ();    //calling the  derivative class to appear the square
    }
}