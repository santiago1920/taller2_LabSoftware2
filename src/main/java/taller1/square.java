/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

public class square extends figure{

    public square(double x1, double y1) {
        super(x1, y1);
    }
    @Override
    public double calculateArea() {
        double area = getX1()*getX1();
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = 4*getX1();
        return perimeter;
    }
    
    
}
