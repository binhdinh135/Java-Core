package CastingAndBoxing;

/*
Nới rộng (widening): Là quá trình làm tròn số từ kiểu dữ liệu có kích thước nhỏ hơn
sang kiểu có kích thước lớn hơn.

byte -> short -> int -> long -> float -> double

 */

public class TestWidening {

    public static void main(String[] args) {
        int i = 100;

        long l = i; // không yêu cầu chỉ định ép kiểu

        float f = l; // không yêu cầu chỉ định ép kiểu

        System.out.println("Giá trị Int: " + i); // Giá trị Int: 100

        System.out.println("Giá trị Long: " + l); // Giá trị Long: 100

        System.out.println("Giá trị Float: " + f); // Giá trị Float: 100.0

    }
}
