package CastingAndBoxing;

public class Animal {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }

    void run() {
        System.out.println("Animal run");
    }

}
