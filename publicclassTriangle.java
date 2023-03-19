public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 4.0;
        side2 = 5.0;
        side3 = 6.0;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Perimeter of triangle is: " + t.getPerimeter() + " units");
        System.out.println("Area of triangle is: " + t.getArea() + " sq. units");
    }
}
