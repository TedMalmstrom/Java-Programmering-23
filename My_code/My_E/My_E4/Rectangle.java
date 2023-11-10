package My_code.My_E.My_E4;

public class Rectangle {
    // area and perimeter
    private double height;
    private double width;

    public double computeArea() {
        double area = height * width;
        return area;
    }

    public double computePerimeter() {
        double perimeter = height * 2 + width * 2;
        return perimeter;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
}
