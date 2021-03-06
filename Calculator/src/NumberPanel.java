import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener {
	ResultPanel resultpanel;
	ResultPanel nextrpanel;
	
	NumberPanel(ResultPanel resultpanel) {
		this.resultpanel = resultpanel;
		// Create layout with 4 rows and columns to show the buttons
		GridLayout numberPanelLayout = new GridLayout(4, 3);

		// Note: You will be setting this layout on number panel as buttons are
		// added to number panel.
		setLayout(numberPanelLayout);

		// create 10 buttons
		for (int i = 0; i < 10; i++) {
			// setText method takes String data type and we have i here as int
			// Again we need to look for a method for converting a number in to
			// string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);

			// Above method converts a int data type to String type
			// Input: number of data type int
			// Output: String data type
			JButton numberButton = new JButton();
			numberButton.addActionListener(this);

			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);

			// adding button to panel
			add(numberButton);

		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = e.getActionCommand();
			//gets the action you did.. like clicked five	
		resultpanel.setNumber(text);


	}
}
