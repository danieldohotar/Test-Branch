package daniel.com.Cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height =(height < 0) ? 0 : height;
    }
    public double getHeight(){
        return this.height = height;
    }
    public double getVolume(){
        double volume = height * getArea();
        return volume;
    }
}
