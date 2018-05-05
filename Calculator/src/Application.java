// Importing Color and other related classes
import java.awt.*;
//Importing Swing apis (JFrame,JPanel,JButton) classes
import javax.swing.*;

public class Application {

	public static void main(String[] args) {

		// Create frame which holds panels	
		// create frame with title through constructor
		JFrame frame = new JFrame("Calculator");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(2,2);
		frame.setLayout(layout);
		
		AnswerPanel answerpanel = new AnswerPanel();
		frame.add(answerpanel);
		
		ResultPanel resultpanel = new ResultPanel();
		frame.add(resultpanel);
		
		ResultPanel nextrpanel = new ResultPanel();
		frame.add(nextrpanel);
				
		// create Panel
		NumberPanel numberPanel = new NumberPanel(resultpanel);
		numberPanel.setBackground(Color.CYAN);
		// add panel to the frame
		frame.add(numberPanel);
		
		OperationPanel operationPanel = new OperationPanel(resultpanel);
		frame.add(operationPanel);
		// Make visible at the end so that button and panel will show up

		frame.setVisible(true);
	}
}


