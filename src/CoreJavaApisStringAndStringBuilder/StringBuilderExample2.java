package CoreJavaApisStringAndStringBuilder;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        /*
        charAt(), indexOf(), length(), and substring()
         */
        System.out.println("------------- charAt(), indexOf(), length(), and substring() ---------------");
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // anim
        int len = sb.length(); // 7
        char ch = sb.charAt(6); // s
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

        /*
        append(): Phương thức append() của lớp StringBuilder nối thêm tham số vào cuối chuỗi.
         */
        System.out.println("------------- append() ---------------");
        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1); // 1c-true

        /*
        insert(): Phương thức insert() của lớp StringBuilder chèn chuỗi vào chuỗi này từ vị trí quy định.
         */
        System.out.println("------------- insert() ---------------");
        StringBuilder sb2 = new StringBuilder("animals");
        sb2.insert(7, "-"); // sb2 = animals-
        sb2.insert(0, "-"); // sb2 = -animals-
        sb2.insert(4, "-"); // sb2 = -ani-mals-
        System.out.println(sb2);

        /*
        delete() và deleteCharAt(): Phương thức delete() ngược lại với phương thức insert().
        Nó xóa các ký tự khỏi chuỗi và trả về một tham chiếu đến StringBuilder hiện tại.
        StringBuilder delete(int startIndex, int endIndex)
        StringBuilder deleteCharAt(int index)
         */
        System.out.println("------------- delete() and deleteCharAt() ---------------");

        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3); // sb3 = adef
        System.out.println(sb3);
//        sb3.deleteCharAt(5); // throws an exception

        /*
        replace(): Phương thức replace() của lớp StringBuilder thay thế chuỗi bằng chuỗi khác từ vị trị
        bắt đầu và kết thúc được quy định.
        StringBuilder replace(int startIndex, int endIndex, String newString)
         */
        System.out.println("------------- replace() ---------------");
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty

        /*
        reverse(): Phương thức reverse() của lớp StringBuilder đảo ngược chuỗi hiện tại.
         */
        System.out.println("------------- reverse() ---------------");

        StringBuilder builder1 = new StringBuilder("ABC");
        builder1.reverse();
        System.out.println(builder1); // CBA

        System.out.println("------------- toString() ---------------");

        StringBuilder sb10 = new StringBuilder("ABC");
        String s = sb10.toString();
        System.out.println(sb10); // ABC
    }
}
