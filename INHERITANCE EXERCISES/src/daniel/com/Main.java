package daniel.com;

import daniel.com.CarpetCostCalculator.Calculator;
import daniel.com.CarpetCostCalculator.Carpet;
import daniel.com.CarpetCostCalculator.Floor;
import daniel.com.Cylinder.Circle;
import daniel.com.Cylinder.Cylinder;
import daniel.com.PoolArea.Cuboid;
import daniel.com.PoolArea.Rectangle;
import daniel.com.Test.Dog;
import daniel.com.Test.GermanSheperd;
import daniel.com.wallArea.Wall;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

      /*  Wall wall = new Wall();
        wall.setHeight(-3);
        wall.setWidth(2);
        System.out.println(wall.getArea());
        wall = new Wall(5, 5);
        System.out.println(wall);*/
        /*Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());*/
/*

        Dog dog = new Dog();
        dog.bark();
        Dog dog1 = new GermanSheperd();
        dog1.bark();
*/

       /* Circle circle = new Circle(3.75);
        System.out.println(circle.getArea() + " " + circle.getRadius());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getHeight() + " " + cylinder.getVolume() + " " + cylinder.getRadius() + " " + cylinder.getArea() );
*/

        Rectangle rect = new Rectangle(5, 10);
        Cuboid cub = new Cuboid(5,10,5);
        System.out.println(cub.getVolume());
    }
}
