import java.awt.Color;
import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create Panel
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);
		f.add(p);		// add panel to the frame
	
		
		// create button
		JButton b = new JButton();
		b.setText("1");
		p.add(b);	// adding button to panel
		
		// Make visible at the end so that button and panel will show up
		f.setVisible(true);
	}

}
