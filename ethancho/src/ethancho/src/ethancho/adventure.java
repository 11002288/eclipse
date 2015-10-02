package ethancho;

import javax.swing.JOptionPane;

public class adventure {
	public static void main(String[] args) {
		String what = JOptionPane
				.showInputDialog(
						null,
						"You are walking down the rode to your house and you hear a scream from one of your neighbors house, do you knock on the door or walk to your house like nothing happened ");
		if (what.equals("walk to my house")) {
			String quess = JOptionPane
					.showInputDialog("You go to your house and look for the key in your bag, but nothing is there. You rember that the last time you saw them was in your car. But, you are scared to go back past your neighbors house, do you push through your fear and look for your keys, or do you knock on the door of the screaming house.");
			if (quess.equals("look for my keys")) {
				JOptionPane.showMessageDialog(null,
						"You found your keys and got into your house.");
			}
		} else if (what.equals("knock on my neighbors door.")) {
			String quest = JOptionPane
					.showInputDialog("They open the door, a mask man then jumps out at you and knocks you out. Next thing you know you are tied to a chair with a rope. Do you slim your wrist to get out, or do you un tie your neighbor");
			;

			// String neighbors=JOptionPane.showMessageDialog(null, quest);
			if (quest.equals("un tie my neighbor")) {
				JOptionPane
						.showInputDialog("your neighbor runs with out thinking about you, do you yell for him or wait there in the chair.");
			} else if (quest.equals("yell for him")) {
				JOptionPane.showMessageDialog(null,
						"The masked man hears and kills you both");
			}if (quest.equals("wait")) {
				JOptionPane.showMessageDialog(null, "your neighbor calls the cops and they catch the criminal");
			}
		}

	}

}
