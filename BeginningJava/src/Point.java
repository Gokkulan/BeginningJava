public class Point {
    private int x; //private sets ints so that they can only be used in this class
    private int y;

    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y=y1;
    }
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public void setLocation(int x1, int y1){
        x=x1;
        y=y1;
    }
    public String toString(){ //object Reference so non static
        return "Point = ("+x+","+y+")"; //Concatenation to get a point
    }
    public static double distance(Point p1, Point p2){
        double varX = Math.pow(p1.x-p2.x,2);
        double varY = Math.pow(p1.y-p2.y,2);
        return Math.sqrt(varX+varY);
    }
    public boolean isVertical(Point other){
        if (this.x == other.x){
            return true;
        }
        else{
            return false;
        }
    }
    public double slope(Point other){
        if (x==other.x){
            return (-00000000000000000000000000000000000000000000001);
        }
        else{
            return (double)(y-other.y/x-other.x);
        }
    }
    public boolean collinear(Point p3, Point p4){
        boolean Test1 = isVertical(p3);
        boolean Test2 = isVertical(p4);
        if (Test1&&Test2){ //if Test1 and Test2 are BOTH true
            return true;
        }
        double s1 = slope(p3); //sets two different slopes
        double s2 = slope(p4);
        if (Math.abs(s1-s2)<0.001){
            return true;
        }
        return true;
    }
}
