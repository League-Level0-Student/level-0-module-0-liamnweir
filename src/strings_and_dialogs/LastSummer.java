package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
String Name=	JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "I know that you talked over last summer, "+Name);
}
}
