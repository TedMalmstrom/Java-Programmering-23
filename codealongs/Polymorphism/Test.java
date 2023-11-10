package codealongs.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(12, 65.2, 131.8);
        System.out.println(a.getLength());
        
        Walrus w = new Walrus(16, 312, 125);
        System.out.println(w.getLength());

        walrusChecker(a);
        walrusChecker(w);

        Parrot p = new Parrot(3, 26, 38, "Billy");
        p.fly(10);
        walrusChecker(p);

        Robot r = new Robot();
        introduce(p);
        introduce(r);
    }

    public static void walrusChecker(Animal a) {
        if (a instanceof Walrus) {System.out.println("This animal is a walrus! ");}
        else {System.out.println("This animal is not a walrus, it is a " + a.getClass().getSimpleName());}
    }

    public static void introduce(Talking t) {
        t.talk("Hello!");
    }
}
