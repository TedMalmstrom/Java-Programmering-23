//Varför vill vscode att jag ska ha med package?
package My_code.My_Scanner;
import java.util.Scanner;

public class myExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please input a number: ");
        myNumber = scanner.nextInt();

        //Resten av koden sluter funka när jag skriver in average salery?
        //Tar jag bort den funkar allt
        System.out.println("Input the average salery: ");
        double avgSalary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter a message: ");
        String message = scanner.nextLine();


        System.out.println("Input number: " + myNumber);
        System.out.println("The average salery is: " + avgSalary);
        System.out.println("The message is: " + message);

        scanner.close();
    }
}
