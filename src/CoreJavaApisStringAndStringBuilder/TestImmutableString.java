package CoreJavaApisStringAndStringBuilder;

/*
Khi một đối tượng String được tạo, nó không được phép thay đổi. String là bất biến.
 */

public class TestImmutableString {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" Java"); //phương thức concat() để nối thêm chuỗi vào đuôi chuỗi s.
        System.out.println(s); //sẽ chỉ in ra "Hello" vì các chuỗi này là đối tượng không thể thay đổi.

        s = s + " Android"; // neu viet nhu nay se cong duoc chuoi
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" SpringBoot");
        System.out.println(sb1);


    }
}
