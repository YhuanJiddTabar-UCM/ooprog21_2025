// This class uses DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;

class DebugFour1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        //Created a DebugCircle with radius input
        DebugCircle c = new DebugCircle(radius);

        //Used the correct method names from DebugCircle
        System.out.println("The radius is " + c.getRadius());     // changed getRad() to getRadius()
        System.out.println("The diameter is " + c.getDiameter()); // changed getDiam() to getDiameter()
        System.out.println("The area is " + c.getArea());
    }
}

