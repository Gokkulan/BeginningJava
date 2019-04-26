//Gokulan Anand
//April 19, 2019

public class Box {
    public static void main(String[] args){
        BoxClass x= new BoxClass();
        x.setLength(25.0);
        x.setWidth(12.9);
        double area = x.CalculateArea();
        System.out.println("The area of the box is "+ area);
        double volume = x.CalculateVolume();
        System.out.println("The volume of the box is "+ volume);
    }
}
