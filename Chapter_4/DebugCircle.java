public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

       public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }


    public int getRadius() {   // removed the extra semicolon (;) after method header 
        return radius; // corrected "radiuss" to "radius"

    }

      public int getDiameter() {  //  changed return type from void to int

        return diameter;
    }

    public double getArea() {
        return area;
    }
}
