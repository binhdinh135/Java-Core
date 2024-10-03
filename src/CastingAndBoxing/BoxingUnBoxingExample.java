package CastingAndBoxing;

import java.util.Objects;

/*
 Boxing: là quá trình chuyển đổi một kiểu dữ liệu nguyên thủy thành một đối tượng tương ứng
 Unboxing: là quá trình chuyển đổi một đối tượng (như Integer) về kiểu dữ liệu nguyên thủy tương ứng (như int).
 */
public class BoxingUnBoxingExample {

    public static void main(String[] args) {
        /* Boxing: chuyển đổi int thành Integer
        Nguyen thuy, chung ta se phai su dung nhu sau:
        Sau nay java se Auto Boxing va Auto Unboxing
        Chung ta su dung valueOf() de lay gia tri
        */
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt); // Boxing
        System.out.println("Boxed Integer: " + boxedInt);

        // Unboxing: chuyển đổi Integer thành int
        Integer boxedIntExampleTwo = Integer.valueOf(1000);
        int primitiveIntExampleTwo = boxedIntExampleTwo.intValue(); // Unboxing
        System.out.println("Unboxed int: " + primitiveIntExampleTwo);

        int a = 10;
        int b = a++; // set b = a roi moi +1 cho a
        System.out.println(a); // a = 11
        System.out.println(b); // b = 10

        int c = 10;
        int d = ++ c; // + 1 cho c, roi moi gan c cho d
        System.out.println(c); // c = 11
        System.out.println(d); // d = 11

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.setName("Dinh Cong Binh");
        animal2.setName("Dinh Cong Binh");
        if (animal1.equals(animal2)) {
            System.out.println("Animal 1 and Animal 2 are the same");
        } else {
            System.out.println("Animal 1 and Animal 2 are not the same");
        }
        if (Objects.equals(animal1.getName(), animal2.getName())) {
            System.out.println("Animal 1 and Animal 2 are the same Name");
        } else {
            System.out.println("Animal 1 and Animal 2 are not the same Name");
        }

    }
}
