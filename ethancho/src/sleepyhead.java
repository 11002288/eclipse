import javax.swing.JOptionPane;


public class sleepyhead {
	// Copyright Wintriss Technical Schools 2013
	

	

		public static void main(String[] args) {
			
			
			int isWeekday=JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
					JOptionPane.YES_NO_OPTION);
					/*
			 * Ask the user for these values using
			  JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
			 * JOptionPane.YES_NO_OPTION);
			 */
		if(isWeekday==0){JOptionPane.showMessageDialog(null,"get up lazy bones");}
		if(isWeekday==1){JOptionPane.showMessageDialog(null,"sleep in");}
			
			 // Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
			// print “get up lazybones!” If it is a weekday, and we are on vacation,
			 // print “sleep in”.
			 
		}
	}



