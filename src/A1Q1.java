
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city called kitchener
        City kitchener = new City ();
        // creating the wall in the city to make initial situation
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        // creating a new robot
        Robot karel = new Robot(kitchener, 0, 2, Direction.WEST);
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
    }
}
