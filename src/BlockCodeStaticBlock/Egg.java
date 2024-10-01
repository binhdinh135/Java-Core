package BlockCodeStaticBlock;

public class Egg {

    private int number = 3;
    static int testValue = 10;

    static {
        System.out.println("Static method");
        testValue = 20;
        System.out.println("Static method testValue: " + testValue);


    }

    public Egg() {
        System.out.println("Call to constructor method");
        number = 5;
    }
    public static void main(String[] args) {
        System.out.println("Start main method");
        Egg egg = new Egg();
        System.out.println("After create Egg");
        System.out.println(egg.number);
    }

    {
        System.out.println("Call to initializer block code");
        System.out.println("Begin number = " + number);
        number = 4;
        System.out.println("After set at initializer block, number = " + number);

    }
}
