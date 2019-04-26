/*
Gokulan Anand
4/16/2019
#54 makes a scanner and user inputs a number. The program finds the cube of the number and outputs it.
#56 makes a dialog box for the user to input his/her full name. The program finds the first and last name and outputs them separately.
 */

import javax.swing.*;
import java.util.*;
public class AprilSixteenHWProbs {
    public static void main(String[] args){
        //#54
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        String whattheysaid = input.nextLine();
        double thenumber = Integer.parseInt(whattheysaid);
        thenumber = thenumber*thenumber*thenumber;
        System.out.println(thenumber);



        //#56
        String name = JOptionPane.showInputDialog(null, "Please enter your full name:");
        int spacefinder = name.indexOf(" ");
        String firstname = name.substring(0,spacefinder);
        String lastname = name.substring(spacefinder+1);
        System.out.println("Your first name is "+ firstname);
        System.out.println("Your last name is " + lastname);

    }
}
