package _00_IntroToArrays;



import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Random r = new Random();

	//2. create an array of 5 robots.
	int x = r.nextInt(7);
	Robot[] bobots = new Robot[x];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < bobots.length; i++) {
bobots[i]= new Robot();
bobots[i].miniaturize();
bobots[i].setX(i*100+80);
bobots[i].setY(500);
bobots[i].setSpeed(10000);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up



	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
boolean top =false;

while (!top) {
		
	
for (int i = 0; i < bobots.length; i++) {
	
	bobots[i].move(r.nextInt(50));
	if(bobots[i].getY()<50) {
		top=true;
		i++;
		JOptionPane.showMessageDialog(null, "ROBOT "+ i + " WINS");
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
for (int i = 0; i < bobots.length; i++) {
	bobots[i].hide();
}
bobots[0].show();
bobots[0].penDown();
bobots[0].setX(350);
for (int i = 0; i < 360; i++) {
	bobots[0].setRandomPenColor();
	bobots[0].turn(1);
	bobots[0].move(2);
}
bobots[0].setX(400);
bobots[0].setY(200);
bobots[0].setAngle(180);

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
