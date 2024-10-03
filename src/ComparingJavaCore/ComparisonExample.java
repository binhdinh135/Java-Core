package ComparingJavaCore;

/*
1. Sử dụng "==" khi bạn cần so sánh các kiểu dữ liệu nguyên thủy
hoặc kiểm tra xem hai tham chiếu có trỏ đến cùng một đối tượng hay không.

2.Sử dụng ".equals()" khi bạn cần so sánh nội dung của các đối tượng để kiểm tra tính bằng nhau của chúng.
*/

public class ComparisonExample {

    public static void main(String[] args) {
        // So sánh giá trị nguyên thủy
        int x = 10;
        int y = 10;
        System.out.println(x == y); // Output: true

        // So sánh đối tượng String
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2); // Output: false (tham chiếu khác nhau)
        System.out.println(str1.equals(str2)); // Output: true (nội dung giống nhau)
    }

}
