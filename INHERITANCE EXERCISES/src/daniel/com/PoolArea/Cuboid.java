package daniel.com.PoolArea;

public class Cuboid  extends Rectangle{

    private double heigth;

    public Cuboid(double width, double length, double heigth) {
        super(width, length);
        this.heigth = ( heigth < 0) ? 0 : heigth;
    }
    public double getHeigth(){
        return this.heigth = heigth;
    }
    public double getVolume(){
        double volume;
        return volume = getArea() * heigth;
    }
}
