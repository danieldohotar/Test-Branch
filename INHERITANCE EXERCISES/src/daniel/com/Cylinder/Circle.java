package daniel.com.Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return this.radius = radius;

    }

    public double getArea(){
        double area = (radius * radius * Math.PI);
        return area;
    }
}
