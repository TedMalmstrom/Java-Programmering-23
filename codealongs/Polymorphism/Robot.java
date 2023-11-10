package codealongs.Polymorphism;

public class Robot implements Talking {
    public String name = "Mr Robot";
    
    public void talk(String message) {
        System.out.println("Mesage recived. Generating void output... ");
        if (message.length() < 25) {
            System.out.println(message);
        }else {
            System.out.println("Too long");
        }
    }

}
