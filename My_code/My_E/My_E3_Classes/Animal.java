package My_code.My_E.My_E3_Classes;

class Animal {
    //Varför ha public? Behöver ju bara komma åt dom i detta package?
    public String species;
    String name;
    int age;
    double height;
    
    Animal (String species, String name, int age, double height) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Animal (String species) {
        this(species, "No name", 0, 0.0);
    }

    Animal (String species, String name) {
        this(species, name, 0, 0.0);
    }

    Animal (String species, String name, int age) {
        this(species, name, age, 0.0);
    }

    Animal () {
        this("Unknown", "No name.", 0, 0.0);
    }

    //Spelar de någon roll att ha public här också?
    public void printDetails() {
        System.out.println("------------------------");
        System.out.println("Species: " + species);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("height: " + height + " cm");
    }
}
