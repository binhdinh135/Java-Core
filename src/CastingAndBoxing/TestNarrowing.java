package CastingAndBoxing;

/*
Thu hẹp (narrowwing): Là quá trình làm tròn số từ kiểu dữ liệu có kích thước lớn hơn
sang kiểu có kích thước nhỏ hơn.

Chuyển kiểu loại này không thể thực hiện ngầm định bởi trình biên dịch, người dùng
phải thực hiện chuyển kiểu tường minh.

double -> float -> long -> int -> short -> byte

 */
public class TestNarrowing {
    public static void main(String[] args) {
        double d = 100.04;

        long l = (long) d; // yêu cầu chỉ định kiểu dữ liệu (long)

        int i = (int) l; // yêu cầu chỉ định kiểu dữ liệu (int)

        System.out.println("Giá trị Double: " + d);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Int: " + i);
    }
}
