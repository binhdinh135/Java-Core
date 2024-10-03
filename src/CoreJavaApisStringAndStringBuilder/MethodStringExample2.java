package CoreJavaApisStringAndStringBuilder;

public class MethodStringExample2 {
    public static void main(String[] args) {

        System.out.println("-------------- indexOf ----------------");

        /*
        indexOf(String subString): Phương thức indexOf(String subString) trả về vị trí đầu tiên của
        chuỗi con subString trong chuỗi gốc, hoặc -1 nếu không tìm thấy.
        */
        String day = "Sunday";
        System.out.println(day.indexOf('n')); // 2
        System.out.println(day.indexOf("Sun")); // 0
        System.out.println(day.indexOf("sun")); // -1
        System.out.println(day.indexOf('z', 2)); // -1
        System.out.println(day.indexOf("sa")); // -1

        System.out.println("-------------- subString ----------------");
        /*
        subString: Phương thức subString() trả về chuỗi con của một chuỗi.
        */
        String s1 = "hellojava";
        System.out.println(s1.substring(3, 7));// "loja"
        System.out.println(s1.substring(3));// "lojava"
        System.out.println(s1.substring(9,9));// empty string
//        System.out.println(s1.substring(3,2));// throws exception
//        System.out.println(s1.substring(3,10));// throws exception

        System.out.println("-------------- equals and equalsIgnoreCase ----------------");

        // equals và equalsIgnoreCase
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        /*
        contains(): Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này.
        Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, nếu không trả về false.
         */
        System.out.println("-------------- contains ----------------");
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false


        /*
        trim(), strip(), stripLeading(), và stripTrailing() -> xoa khoang trang truoc & sau
        strip(), stripLeading(), và stripTrailing() co tu java 11.
        * */
        System.out.println("-------------- strip(), stripLeading(), và stripTrailing() ----------------");

        String text = " abc\t ";
        System.out.println("abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c;
//        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading()); // Xoa khoang trang phia dau cua String
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing()); // Xoa khoang trang phia sau cua String
        System.out.println(text.stripTrailing().length());// 4

        System.out.println("-------------- Example: ----------------");
        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        System.out.println(trimmed);
        String lowercase = trimmed.toLowerCase(); // "animal"
        System.out.println(lowercase);
        String result = lowercase.replace('a', 'A'); // "AnimAl"
        System.out.println(result);

    }
}
