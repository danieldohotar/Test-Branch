package daniel.com.PoolArea;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = ( width < 0 ) ? 0 : width;
        this.length =( length < 0 ) ? 0 : length;
    }
    public double getWidth (){
        return this.width = width;
    }
    public double getLength (){
        return this.length = length;
    }
    public double getArea () {
        double area;
        return area = width * length;
    }
}
