package taller1;

abstract class figure {
    private double x1;
    private double y1;

    public figure(double x1, double y1) {
        requireNonNegative("x1", x1);
        requireNonNegative("y1", y1);
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        requireNonNegative("x1", x1);
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        requireNonNegative("y1", y1);
        this.y1 = y1;
    }

    static void requireNonNegative(String name, double value) {
        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException(name + " no puede ser negativo ni NaN, recibido: " + value);
        }
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
