import javax.swing.JOptionPane;

public class Guesstheanimal {
	public static void main(String[] args) {
		String legs = JOptionPane.showInputDialog("does it have four legs");
		if (legs.equals("yes")) {
			String stripes = JOptionPane
					.showInputDialog("does it have stripes");
			if (stripes.equals("yes")) {
				JOptionPane.showMessageDialog(null, "It might be a zebra");
			} else {
				JOptionPane.showMessageDialog(null, "it might be a pig");
			}
		} else {
			String twolegs = JOptionPane.showInputDialog("does it have two legs");
if (twolegs.equals("yes")) {
	String fur=JOptionPane.showInputDialog("does it have fur");
	if (fur.equals("yes")) {
		JOptionPane.showMessageDialog(null, "it might be a monkey");
	}else JOptionPane.showMessageDialog(null, "it might be a bird");
}String water=JOptionPane.showInputDialog("does it live in water");
if (water.equals("yes")) {
	JOptionPane.showMessageDialog(null, "it might be a fish");
}
		}

	}
}
