import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j = new JFrame();
		j.setSize(1000, 1000);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		GridLayout g = new GridLayout(1,3); // row,column
		j.setLayout(g);

		JPanel p = new JPanel();
		p.setSize(100, 100);
		p.setBackground(Color.RED); // 3 classes total - panel, frame, color
		j.add(p);

		JPanel d = new JPanel();
		d.setSize(100, 100);
		d.setBackground(Color.GREEN); // 3 classes total - panel, frame, color
		j.add(d);

		JPanel l = new JPanel();
		l.setSize(100, 100);
		l.setBackground(Color.BLUE); // 3 classes total - panel, frame, color
		j.add(l);

		p.setVisible(true);
		l.setVisible(true);
		d.setVisible(true);
// create class person and student -- 6 props--- method called enroll
	}

}
