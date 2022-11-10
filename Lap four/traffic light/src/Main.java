//graphic program to create traffic Light
import javax.swing.*;
import java.awt.*;

// graphical libraries

public class Main {

    static class TrafficLight extends JFrame{     // class traffic light inherited from JFrame class
        TrafficLight() {

            GridLayout layout = new GridLayout();   // the layout of the rectangle
             setLayout(layout);
             setVisible(true);
             setSize(450,450);
             setTitle("traffic light");
             setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            JPanel redpan = new JPanel();
            redpan.setBackground(Color.red);
            JLabel stop = new JLabel("stop");
            stop.setVerticalAlignment(JLabel.CENTER);
            stop.setHorizontalAlignment(JLabel.CENTER);
            redpan.add(stop);
            add(redpan);

            // this panel to show the red color

            JPanel  ypan =new JPanel();
            ypan.setBackground(Color.yellow);
            JLabel ready = new JLabel("ready");
            ypan.add(ready);
            add(ypan);

            // this panel to show the yellow color


            JPanel gpan  =new JPanel();
            gpan.setBackground(Color.green);
            JLabel go = new JLabel("go");
            gpan.add(go);
            add(gpan);

            // this panel to show the green color


        }
    }
    public static void main(String[] args) {

        new TrafficLight();  //calling the class

    }
}