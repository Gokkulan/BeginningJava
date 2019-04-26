/*
       Gokulan Anand
       Program Diamond
       Print a three diamond thing
       March 25, 2019
       Ver1
        */
public class Diamond {
    public static void main (String[] args){
        DiamondMethod();    //Calling the Diamond Method
        DiamondMethod();
        DiamondMethod();
    }


    public static void DiamondMethod()  //Defining the Diamond with println statements
    {


        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
    }
}