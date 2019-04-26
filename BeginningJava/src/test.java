public class test {
    public static void main (String[] args){
        LanternMethod();
    }
    public static void LanternMethod(){
        top();
        System.out.print("\n");
        top();
        whale();
        top();
    }
    public static void top(){
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void whale(){
        System.out.println("* | | | | | *");
        System.out.println("*************");
    }
}
