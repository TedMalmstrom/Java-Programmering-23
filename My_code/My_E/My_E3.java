package My_code.My_E;
import java.util.Scanner;

public class My_E3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        //Välj 1(i), 2(ii) eller 3(iii).
        int myChoice;

        System.out.println("Hi, please input the number for what you want to do.");
        System.out.println("(1) Calculate the area of a triangle.");
        System.out.println("(2) Celsius to Fahrenheit.");
        System.out.println("(3) Check if a number is odd or even.");
        myChoice =  scanner.nextInt();

        if (myChoice <= 3 && myChoice >= 1) {
            switch (myChoice) {
                case 1: //i. The area of a triangle. Area = (1/2) × base × height
                    int triangleBase;
                    int triangleHeight;
                    int triangleArea;

                    System.out.println("Please enter the base of the triangle.");
                    triangleBase = scanner.nextInt();

                    System.out.println("Now please enter the height of the triangle.");
                    triangleHeight = scanner.nextInt();

                    triangleArea = triangleBase * triangleHeight / 2;
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;

                case 2: //ii. Degrees Celsius to Fahrenheit. °F = (°C × 9/5) + 32
                    int celsius;
                    int fahrenheit;

                    System.out.println("Please type what degrees Celsius you want to convert to Fahrenheit.");
                    celsius = scanner.nextInt();

                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " celcius" + " = " + fahrenheit + " fahrenheit." );
                    break;
        
                case 3: //iii. A Check if a number is odd or even. if(i % 2 == 0)
                    int myNumber;

                    System.out.println("Write a number to check if it's odd or even");
                    myNumber = scanner.nextInt();

                    if (myNumber % 2 == 0)
                        System.out.println(myNumber + " is an even number.");
                    else
                        System.out.println(myNumber + " is an odd number.");
                    break;

            }
        scanner.close();
        }
        else 
            System.out.println("You can only choose 1, 2 or 3.");
        
    }
}
