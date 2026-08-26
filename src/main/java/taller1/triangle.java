package taller1;

public class triangle extends figure{

    public triangle(double x1, double y1) {
        super(x1, y1);
    }
    
    
    
    
    @Override
    public double calculateArea() {
        double area = (getX1()*getY1())/2;
        return area;
    }
    
    //No es posible calcular el perimetro de un triangulo con solo 2 datos de sus medidas
    @Override
    public double calculatePerimeter() {
        return 0;
    }
    
    
}
