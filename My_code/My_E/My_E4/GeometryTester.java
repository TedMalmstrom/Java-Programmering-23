package My_code.My_E.My_E4;
import java.util.Scanner;

public class GeometryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*
        Circle circle = new Circle();
        System.out.println("Please enter the radius of the circle");
        circle.setRadius(scanner.nextDouble());

        System.out.println("The area of the circe is: " + circle.computeArea());
        System.out.println("The circumference is: " + circle.computeCircumference()); */
        
        
        Rectangle rectangle = new Rectangle();
        System.out.println("Please enter the width of the rectangle");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("Please enter the height of the rectangle");
        rectangle.setHeight(scanner.nextDouble());

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("the area of the rectange is: " + rectangle.computeArea());
        System.out.println("The perimeter of the rectangle: " + rectangle.computePerimeter());

        scanner.close();
    }
}
