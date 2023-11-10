package My_code.My_E;

class Book {        
    private String title;
    private String author;
    private int year;

    public Book() {
        title = "Default title";
        author = "Default author";
        year = 2023;
    }

    public void printDetails() {
        System.out.println("title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class Student {
    private String name;
    private int age;
    private double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Car {
    private String model;
    private  String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car(String model){
        this(model, "Unknown", 0);
    }

    public Car(){
        this("Unknown", "Unknown", 0);
    }
    
    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class E3Classes {
    public static void main(String[] args){
        Book book1 = new Book();
        Student student = new Student("Ben", 20, 8.7);
        Car car1 = new Car("Brumbrum", "Blue", 2017);
        Car car2 = new Car();
        Car car3 = new Car("BMW");

        car3.printDetails();
        //System.out.println(car3.model);
        //System.out.println(car2.model + " " + car2.color + " " +  car2.year);
        

    }
    
}