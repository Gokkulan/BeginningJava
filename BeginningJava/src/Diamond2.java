/*
       Gokulan Anand
       Program Diamond
       Print the diamond shape using two methods: top and bottom
       March 25, 2019
       Ver2
        */
public class Diamond2 {
    public static void main (String[] args){
        DiamondMethod();
        reverseDiamond();
    }


    public static void DiamondMethod(){
        top();
        bot();
    }

    public static void reverseDiamond(){
        bot();
        top();
    }

    public static void top(){
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
    }

    public static void bot(){
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
    }
}