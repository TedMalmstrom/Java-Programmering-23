package My_code.My_E.My_E3_Classes;

public class MainExecutorClass {
    public static void main(String[] args){
        Zoo zoo = new Zoo();

        System.out.println(zoo.zooName);

        //zoo.cat.printDetails();
        zoo.bear.printDetails();
        
        Animal elephant = new Animal("Big", "Dumbo", 5, 64.3);
        
        //Animal anotherCat = zoo.cat;
        Animal anotherCat = new Animal();
        anotherCat.name = "William";
        anotherCat.age = 7;

        elephant.printDetails();
        anotherCat.printDetails();
        zoo.cat.printDetails();
    }
}
