import java.awt.*;
public class Application {

	public static void main(String[] args) {
		Frame f = new Frame("BOB THE GUI");
		f.setSize(600,600);
		f.setVisible(true);
		f.setBackground(Color.cyan);
		Label L1 = new Label("GUI APPLICATION");
		f.add(L1);
		Label L2 = new Label("COLORRRRRRR");
		f.add(L2);
		
	}

}
