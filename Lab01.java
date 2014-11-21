/**
*
* Description of the program goes here  // provide a brief description
*
* @author Monica
* @version 11/21/14
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

public static void main(String[] args) { 
Display.openWorld("maps/school.map");
   Display.setSize(10, 10);
   Display.setSpeed(3);
   Robot pete = new Robot(4,5,Display.SOUTH,0);
   Robot lisa = new Robot();
   
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.pickBeeper();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.putBeeper();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   
   pete.move();
   pete.pickBeeper();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.putBeeper();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();


     }
   }
