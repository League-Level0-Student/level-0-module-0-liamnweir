package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	Robot r2d2 = new Robot ();
	String color= JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, "My favorite color is "+color+ " too!");
    r2d2.miniaturize();
	r2d2.setSpeed(20);
	r2d2.penDown();
	r2d2.turn(-90);
	r2d2.move(60);
	r2d2.turn(120);
	r2d2.move(60);
	r2d2.turn(120);
	r2d2.move(60);
	r2d2.penUp();
	r2d2.move(200);
}
}
