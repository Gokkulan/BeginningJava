import java.util.Scanner;
public class ProgramScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low;
        int high;
        System.out.println("Enter the low number");
        low = input.nextInt();
        System.out.println("Enter the high number");
        high = input.nextInt();
        int sum = low;
        int sum2 = low;
        for (int i = low; i < high; i++) {
            sum++;
            sum2 = sum2 + sum;

        }
        System.out.println(sum2);
    }
}
