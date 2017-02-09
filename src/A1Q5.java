
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating new city
        City kitchener = new City();
        //creating new wall
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        //creating new things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        //creaing new robots
        Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        //labeling robots
        karel.setLabel("K");
        maria.setLabel("M");
        //moving robots to pick up things and meet
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
    }
}
