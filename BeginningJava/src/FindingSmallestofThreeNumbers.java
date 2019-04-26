import java.util.*;
public class FindingSmallestofThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give me three numbers please:");

        int smallest;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a<b && a<c){
            smallest = a;
        }
        else if (b<c){
            smallest = b;
        }
        else{
            smallest = c;
        }
        System.out.println("The smallest number you entered is " + smallest);
    }
}
