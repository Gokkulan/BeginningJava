public class USNuclearBomb {
    public static void main (String[] args){
        NukeMethod();

    }
    public static void NukeMethod(){
        top();
        bot();
        square();
        bot();
        top();
    }
    public static void top(){
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
    }
    public static void bot(){
        System.out.println("+-----+");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("+-----+");
    }
    public static void square(){
        System.out.println("|United|");
        System.out.println("|States|");
    }

}
