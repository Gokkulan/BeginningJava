public class Challenge1 {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        caratMethod();
    }

    public static void caratMethod() {
        int center = 0;
        if (SIZE%2==0) {
            center = SIZE / 2;
        } else {
            center = SIZE/2+1;
        }

        line();
        top(center);
        bot(center);
        line();
        bot(center);
        top(center);
        line();
    }

    public static void line() {
        System.out.print("+");
        for (int counter = 1; counter <= SIZE + 1; counter++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top(int center) {


        for (int lineNumber = 1; lineNumber <= center; lineNumber++) {
            System.out.print("|");
            int spaces = center - lineNumber;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            int slashcount = center - (spaces + 1);
            if(slashcount > 0) {
                for (int slash = 1; slash <= slashcount; slash++) {
                    System.out.print("/");
                }
            }
            System.out.print("*");
            if(slashcount > 0) {
                for (int slash = 1; slash <= slashcount; slash++) {
                    System.out.print("\\");
                }
            }
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
    public static void bot(int center) {
        for (int lineNumber = 1; lineNumber <= center; lineNumber++) {
            System.out.print("|");
            int slashcount = center - lineNumber;
            int spaces = center - (slashcount + 1);
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            if(slashcount > 0) {
                for (int slash = 1; slash <= slashcount; slash++) {
                    System.out.print("\\");
                }
            }
            System.out.print("*");
            if(slashcount > 0) {
                for (int slash = 1; slash <= slashcount; slash++) {
                    System.out.print("/");
                }
            }
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}