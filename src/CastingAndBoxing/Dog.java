package CastingAndBoxing;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void run() {
        System.out.println("Dog run");
    }
}
