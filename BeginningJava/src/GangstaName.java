import java.util.*;
public class GangstaName {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //creates Scanner object
        System.out.println("Enter your full name");

        String fullname = input.nextLine(); //reads user input
        char firstletter = fullname.charAt(0); //charAt finds the character at index at 0. This is the first initial of the full name
        String initial = firstletter + "."; //adds period at the end of the initial


        String Didd = " Diddy"; //simply prints Diddy

        int spacefinder = fullname.indexOf(" "); //finds the index number of the space that separates first and last name
        fullname.substring(fullname.indexOf(" "));
        String firstname = fullname.substring(0,spacefinder); //creates a substring from the first letter to the space index
        String lastname = fullname.substring(spacefinder+1); //creates a substring from the character after the space
        lastname = lastname.toUpperCase(); //capitalizes all the letters of the last name
        String izz = "-izzle"; //simply prints -izzle

        System.out.println("Your gangsta name is " + initial + Didd + " " + lastname + " " + firstname+ ""+ izz);
    }
}
