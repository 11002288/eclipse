package ethancho;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class pialoud {
public static void main(String[] args) {
	
	
	

		// 1. Make a main method and make sure your program can run

		// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String pi= "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609";
		// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"

		// 4. Print ALL the digits of of Pi (hint: use a loop)
for (int i = 0; i < pi.length(); i++) {
	
System.out.print(pi.charAt(i));
speak(pi.charAt(i));
}
		
// 5. Use the speak() method to speak all the digits of Pi.
for (int i = 0; i < args.length; i++) {
	
}
		// [ADVANCED]
		// *6. Get a character from the user using the getInputFromUser() method
String person = JOptionPane.showInputDialog("what number comes next");
		// *7. Compare the users' char to the next digit of Pi

		// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
}


		static void speak(char characterToSpeak) {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void pause(int seconds) {
			try {
				Thread.sleep(1000 * seconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


		static char getInputFromUser() {
			Scanner scanner = new Scanner(System.in);
			return scanner.next().toCharArray()[0];
		}

	
}



































