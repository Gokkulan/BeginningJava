public class PointClient {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        p1.SetX(3);
        p1.SetY(7);
        p2.SetX(-2);
        p2.SetY(-8);
        p1.setLocation(-2,5); //helps us change the point simultaneously
        p3.setLocation(0,239123813);
        double distance = Point.distance(p1,p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("The distance is "+distance);
        System.out.println(p1.slope(p2));
        System.out.println("The point is collinear: " + p1.collinear(p2,p3));
    }
}
