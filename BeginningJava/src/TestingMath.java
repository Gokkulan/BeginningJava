import java.util.*;
public class TestingMath {
    public static void main(String[] args){
        double Num1=45.50;
        double Num2=-350;
        double Num3=0.056;

        double Addition = Num1+Num2+Num3;
        System.out.println("This is the sum " + Addition);

        double Multiply = Num1*Num2*Num3*100;
        Multiply = Math.round(Multiply);
        Multiply = Multiply/100;
        System.out.println("This is the product " + Multiply); //Did all the work so not as many decimals

        double Maximum = Math.max(Num1, Num2);
        Maximum = Math.max(Maximum, Num3);
        double Minimum = Math.min(Num1, Num2);
        Minimum = Math.min(Minimum, Num3);
        System.out.println("The max number is "+ Maximum + "\n The min number is "+ Minimum);

        double rooty = Math.sqrt(Math.abs(Multiply));   //Since the product is negative, we have to do absolute value first to get square root
        System.out.println("The square root of Multiply is " + rooty);

        System.out.println("A random number " + Math.random()); //Only prints numbers between 0 and 1
        Random randy = new Random(10);
        int randy2 = randy.nextInt(11)+10;
        System.out.println("2nd random number "+ randy2);    //randy is not number, but an object.

    }
}
