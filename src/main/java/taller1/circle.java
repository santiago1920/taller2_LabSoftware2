package taller1;
public class circle extends figure {
    private float radius;
    public circle(float radius, double x1, double y1) {
        super(x1, y1);
        requireNonNegative("radius", radius);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        double area=(radius*radius)*3.1416;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter=(radius*2)*3.1416;
        return perimeter;
    }
    
}
