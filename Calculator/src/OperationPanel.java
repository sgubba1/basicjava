import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationPanel extends JPanel implements ActionListener {
	ResultPanel resultpanel;
	OperationPanel(ResultPanel nextrpanel ) {
		this.resultpanel = nextrpanel;
		// Create layout with 5 rows 1 column
				GridLayout layout = new GridLayout(5, 1);
				// Note: You will be setting this layout.
				setLayout(layout);
				Font font = new Font("Serif", Font.BOLD, 66);
				
		setBackground(Color.PINK);

		JButton b1 = new JButton();
		b1.setText("+");
		super.add(b1);
		b1.addActionListener(this);

		JButton b2 = new JButton();
		b2.setText("-");
		add(b2);
		b2.addActionListener(this);


		JButton b3 = new JButton();
		b3.setText("*");
		add(b3);
		b3.addActionListener(this);

		
		JButton b4 =  new JButton();
		b4.setText("/");
		add(b4);
		b4.addActionListener(this);

		
		JButton b5 =  new JButton();
		b5.setText("=");
		add(b5);
		b5.addActionListener(this);

		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String info = e.getActionCommand();
		resultpanel.setOperation(info);
	}
}
