package CoreJavaApis;

public class StringExampleTest {

    public static void main(String[] args) {
        String nameOne = "Fluffy";
        String nameTwo = new String("Fluffy");
        System.out.println("Compare with equals between nameOne and nameTwo: " + nameOne.equals(nameTwo));
        System.out.println("Compare with \"==\" between nameOne and nameTwo: " + (nameOne == nameTwo));

        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12

        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123
        s += "a";
        System.out.println(s); // 123

    }
}
