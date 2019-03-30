package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();

		// 2. create an array of 5 robots.
		int x = r.nextInt(7);
		Robot[] robots = new Robot[x];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].miniaturize();
			robots[i].setX(i * 100 + 80);
			robots[i].setY(500);
			robots[i].setSpeed(10000);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean top = false;

		while (!top) {

			for (int i = 0; i < robots.length; i++) {

				robots[i].move(r.nextInt(50));
				if (robots[i].getY() < 50) {
					top = true;
					i++;
					JOptionPane.showMessageDialog(null, "ROBOT " + i + " WINS");
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		for (int i = 0; i < robots.length; i++) {
			robots[i].hide();
		}
		robots[0].show();
		robots[0].penDown();
		robots[0].setX(350);
		for (int i = 0; i < 360; i++) {
			robots[0].setRandomPenColor();
			robots[0].turn(1);
			robots[0].move(2);
		}
		robots[0].setX(400);
		robots[0].setY(200);
		robots[0].setAngle(180);
	}
}
// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
