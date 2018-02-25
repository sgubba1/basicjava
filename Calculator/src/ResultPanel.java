import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ResultPanel extends JPanel  {
	JTextField textfield;

	ResultPanel() {
		textfield = new JTextField();
		textfield.setText("     ");
		Font font = new Font("Serif", Font.BOLD, 66);
		textfield.setFont(font);
		super.add(textfield);

		GridLayout layout = new GridLayout(2, 2);
		super.setLayout(layout);
	}

	void setNumber(String number) {
		String existing = textfield.getText();

		String newNumber = existing + number;
		textfield.setText(newNumber);

	}
	void setOperation(String operation){
		String existing = textfield.getText();
		
		String newOperation = existing + operation;
		textfield.setText(newOperation);
	}
}
