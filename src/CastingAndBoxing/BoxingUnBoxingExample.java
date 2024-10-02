package CastingAndBoxing;

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

    }
}
