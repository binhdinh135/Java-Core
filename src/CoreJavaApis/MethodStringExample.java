package CoreJavaApis;

/*
String: la moi doi tuong khong bien doi - bat bien (Immutable)
 */

public class MethodStringExample {
    public static void main(String[] args) {

        // toUpperCase() và toLowerCase()
        String s = "Dinh Cong Binh";
        System.out.println(s.toUpperCase()); // Chuyen doi thanh "DINH CONG BINH"
        System.out.println(s.toLowerCase()); // Chuyen doi thanh "dinh cong binh"
        System.out.println(s); // "Dinh Cong Binh" (khong co thay doi nao)

        // trim(): loại bỏ các khoảng trống trắng ở trước và sau chuỗi (leading và trailing).
        String s1 = "   1995mars    ";
        System.out.println(s1); // in ra chuoi nhu ban dau 1995mars (van con khoang trang) System.
        System.out.println(s1.trim()); // in ra chuoi sau khi da cat cac khoang trong trang: 1995mars

        // startWith() và endsWith(): check start/end voi 1 chuoi nao do, gia tri tra ve: true/false
        String s3 = "1995mars";
        System.out.println(s3.startsWith("19")); // true
        System.out.println(s3.endsWith("k")); // false

        // charAt(): trả về ký tự tại chỉ mục đã cho.
        String s4 = "1995mars";
        System.out.println(s4.charAt(0)); // tra ve 1
        System.out.println(s4.charAt(3)); // tra ve 9
        System.out.println(s4.charAt(6)); // tra ve r

        // length() trả về độ dài của chuỗi
        System.out.println(s4.length());
        System.out.println(s4.toUpperCase());

        // intern()
        /*
        Ban đầu, một Pool của các chuỗi là trống, được duy trì riêng cho lớp String.
        Khi phương thức intern được gọi, nếu Pool đã chứa một chuỗi bằng với đối tượng String như
        khi được xác định bởi phương thức equals(object), thì chuỗi từ Pool được trả về.
        Nếu không thì, đối tượng String này được thêm vào Pool và một tham chiếu tới đối tượng String này được trả về.
         */

        String s5 = "1995mars"; // Tao doi tuong moi co gia tri 1995mars trong String pool.
        String s6 = new String("1995mars"); // Tao doi tuong moi thu 2 co gia tri la 1995mars trong String pool.
        /*
        Check xem trong String pool co doi tuong nao co gia tri la 1995mars chua? Neu có roi se tham chieu s7 toi doi tuong do
        Neu chua co se tao moi doi tuong moi trong String pool, va tham chieu s7 toi doi tuong nay
         */
        String s7 = s6.intern();

        String s8 = s6; // co che cua s8 hoat dong tuong tu s7
        String s9 = "1995mars";
        String s10 = "1992_binh_dc";
        System.out.println(s7); // tra ve 1995mars
        System.out.println(s8); // tra ve 1995mars
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // true
        System.out.println(s8 == s6); // true
        System.out.println(s5 == s9); // true
        System.out.println(s5 == s10); // false


    }

}
