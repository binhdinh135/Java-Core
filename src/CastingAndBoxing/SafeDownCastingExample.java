package CastingAndBoxing;

public class SafeDownCastingExample {


    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting

        /*
        Muon down casting an toan, chung ta phai check nhu duoi day:
         */
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting an toàn
            dog.makeSound(); // Output: Woof
        } else {
            System.out.println("animal is not an instance of Dog");
        }

        Animal anotherAnimal = new Animal();
        if (anotherAnimal instanceof Dog) {
            Dog anotherDog = (Dog) anotherAnimal; // Không thực hiện
        } else {
            System.out.println("anotherAnimal is not an instance of Dog");
        }
    }

}
