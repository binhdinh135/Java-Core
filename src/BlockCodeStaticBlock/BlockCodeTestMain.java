package BlockCodeStaticBlock;

public class BlockCodeTestMain {

    static int valueStatic;
    int testValue;
    String name;
    int age;

    public BlockCodeTestMain(String name, int age) {
        System.out.println("This is constructor method.");
        System.out.println("---------------------------------------");
        this.name = name;
        this.age = age;
    }

    static {
        // Static block code se chay dau tien khi chung ta run class BlockCodeTestMain.
        // Truoc ca ham main.
        valueStatic = 42;
        System.out.println("This is static block code");
        System.out.println("valueStatic = " + valueStatic);
        System.out.println("---------------------------------------");

    }

    {
        // Initializer block code: khoi tao dau tien khi Class  BlockCodeTestMain tao moi mot instance.
        // chay truoc ca ham tao (constructor)
        testValue = 43;
        System.out.println("This is test initial block code");
        System.out.println("testValue = " + testValue);
        System.out.println("---------------------------------------");

    }

    public static void main(String[] args) {
        System.out.println("This is main method.");
        System.out.println("ValueStatic: " + valueStatic);
        System.out.println("---------------------------------------");

        // Khi chung ta tao ra mot doi tuong moi cho class BlockCodeTestMain
        // initial method va constructor method se duoc goi -> initial method se goi truoc constructor.
        BlockCodeTestMain blockCodeTestMain = new BlockCodeTestMain("Binh", 32);
        System.out.println("TestValue: " + blockCodeTestMain.testValue);
        System.out.println("---------------------------------------");


    }
}
