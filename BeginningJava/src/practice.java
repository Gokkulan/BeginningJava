public class practice {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        minusPlusMethod();
    }

    public static void minusPlusMethod() {
        for (int linenumber = 1; linenumber <= SIZE; linenumber++) {
            for (int charactercount = 1; charactercount <= linenumber; charactercount++) {
                if (linenumber % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("+");
                }

            }
            System.out.print("\n");

        }
    }
}

