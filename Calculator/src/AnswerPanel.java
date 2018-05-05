
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnswerPanel extends JPanel {
	AnswerPanel(){
	 JTextField answerfield = new JTextField();
		Font font = new Font("Serif", Font.BOLD, 66);
		answerfield.setFont(font);
		answerfield.setText("       ");
	 super.add(answerfield);
	
	}
}
