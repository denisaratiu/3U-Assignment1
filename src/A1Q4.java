
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city
        City kitchener = new City();
        // creating wall
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        //creating robot one
        Robot karel = new Robot(kitchener, 0, 0, Direction.SOUTH);
        //creating robot two
        Robot cupcake = new Robot(kitchener, 0, 1, Direction.SOUTH);
        //moving robots to run into each other
        karel.move();
        cupcake.move();
        karel.move();
        cupcake.turnLeft();
        cupcake.move();
        karel.turnLeft();
        cupcake.turnLeft();
        cupcake.turnLeft();
        cupcake.turnLeft();
        cupcake.move();
        cupcake.turnLeft();
        cupcake.turnLeft();
        cupcake.turnLeft();
        cupcake.move();
        karel.move();
    }
}
