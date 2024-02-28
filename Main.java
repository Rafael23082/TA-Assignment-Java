class Animal{
    String type = "Animal";
    void get_type(){
        System.out.println(type);
    }
    void get_population(){
        System.out.println("Unknown");
    }
}
// The panda class is inherited from the Animal class
class Panda extends Animal{
    private int age;
    String name;
    private String type = "Mammal";
    Panda(String names, int ages){
        this.name = names;
        this.age = ages;
    }

    // Overriding of methods which is a type of Polymorphism
    void get_type(){
        System.out.println(type);
    }
    void get_info(){
        System.out.println("This is " + name + " the panda, he is " + age + " years old this year.");
    }
    void get_population(){
        System.out.println("2.060 pandas");
    }
    void set_name(String newName){
        this.name = newName;
    }
}
public class Main{
    public static void main(String[] args){
        Panda myPanda = new Panda("Bob", 3);

        myPanda.set_name("Bobby");
        myPanda.get_type();
        myPanda.get_info();
    }
}