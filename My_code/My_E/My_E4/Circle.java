package My_code.My_E.My_E4;

public class Circle {
    // area and circumference
    private double radius;
    
    public double computeArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double computeCircumference() {
        double circumference = radius * 2 * Math.PI;
        return circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
