import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Application {

	public static void main(String[] args) {
JFrame J = new JFrame();
J.setSize(1000,1000);
J.setVisible(true);
J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
GridLayout L = new GridLayout();
J.setLayout(L);

JPanel P1 = new JPanel();
P1.setSize(100,100);
P1.setBackground(Color.CYAN);
J.add(P1);

JPanel P2 = new JPanel();
P2.setSize(100, 100);
P2.setBackground(Color.PINK);
J.add(P2);

JPanel P3 = new JPanel();
P3.setSize(100, 100);
P3.setBackground(Color.GREEN);
J.add(P3);




	}

}
