public class Diamond3For {
    public static final int SIZE = 4;
    public static void main (String[] args) {
        diamondMethod("/", " ", "\\");
        reverseDiamond( "\\", " ", "/");
        System.exit( 0); }
    public static void diamondMethod(String beg, String inside, String end){
        top(beg, inside, end);
        bot(end, inside, beg);
    }
    public static void reverseDiamond(String end, String inside, String beg){
        bot("\\", " ", "/");
        top("/", " ", "\\");
    }
    public static void top(String beg, String inside, String end){
        for (int counter =1; counter <= SIZE; counter++){
            for (int space = 1; space <= -counter + SIZE; space++){
                System.out.print(" ");
            }
            System.out.print(beg);
            for (int space = 1; space <= 2 * counter - 2; space++){
                System.out.print(inside);
            }
            System.out.println(end); }
    }
    public static void bot(String beg, String inside, String end){
        int counter = 1;
        for (counter = 1; counter <= SIZE; counter++){
            System.out.print(" ");
        }
        System.out.print(beg);
        for (int space = 1; space <= -2 * counter +2*SIZE; space++){
            System.out.print(inside);
        }
        System.out.println(end);
    }
}
