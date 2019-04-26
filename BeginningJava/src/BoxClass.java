public class BoxClass {
    private double length;
    private double width;
    private double height;

    public void setLength(double x){
        length = x;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double y){
        width = y;
    }
    public double getWidth(){
        return width;
    }
    public double CalculateArea(){
        return length*width;
    }
    public double CalculateVolume(){
        return length*width*height;
    }
    public BoxClass(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }
    public String toString(){
        return "My length is "+ length + " and my width is " + width;
    }
}
