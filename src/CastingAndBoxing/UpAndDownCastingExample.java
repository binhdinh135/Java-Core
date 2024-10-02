package CastingAndBoxing;

public class UpAndDownCastingExample {

    public static void main(String[] args) {
        /*
        Upcasting la qua trinh chuyen doi doi tuong con thanh cha cua no
        Upcasting an toan, khong can thuc hien bang tay vi no luon hop le
        */
        // Cach 1:
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        animal.makeSound(); // Output: Woof

        // Cach 2:
        Animal animal2 = new Dog();
        animal2.run();

        /*
        DownCasting la qua trinh chuyen doi doi tuong cha thanh doi tuong con
         */
        System.out.println("----------------------------");
        System.out.println("DownCasting");
        Animal animalDown = new Dog(); // Upcasting
        Dog dogDown = (Dog) animalDown; // Downcasting
        dogDown.makeSound(); // Output: Woof

        // Downcasting không hợp lệ
        Animal anotherAnimal = new Animal();
//         Dog anotherDog = (Dog) anotherAnimal; // Lỗi: ClassCastException

        //
        int a = 9;
        Integer b = 0;
        b = (Integer) a;
        System.out.println("b:" + b);

        // Day cung la mot vi du cua viec casting
        int c = 10;
        float d = (float) c;
        System.out.println("d: " + d);
    }
}
