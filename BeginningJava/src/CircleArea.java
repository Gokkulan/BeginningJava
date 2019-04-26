/*
Gokulan Anand
March 20, 2019
Program: Calculate the area of a circle
Declare a float constant for pi, a float for radius, and a double for area
 */
public class CircleArea {
    public static void main(String[] args){
        final float MYPI= 3.14f;
        double radius = 10.0;
        double area;
        for (int count =1; count <= 10; count++)
        {
            area = MYPI * radius;
            System.out.print("The area of the circle of radius \t" + radius + "inches is \t" + area +"\"square inches\"");
            radius = radius + 5;
        }

    }
}
