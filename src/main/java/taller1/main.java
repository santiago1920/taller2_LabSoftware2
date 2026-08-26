package taller1;


public class main {
    public static void main(String[] args) {
        circle c1 = new circle(3, 3, 4);
        square s1= new square(4, 4);
        triangle t1 = new triangle(3, 4);
        System.out.println("El area del circulo es: "+c1.calculateArea());
        System.out.println("El perimetro del circulo es: "+c1.calculatePerimeter());
        System.out.println("El area del cuadrado es: "+s1.calculateArea());
        System.out.println("El perimetro del cuadrado es: "+s1.calculatePerimeter());
        System.out.println("El area del triangulo es: "+t1.calculateArea());
    }
    
}

