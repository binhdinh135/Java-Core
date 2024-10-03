package CoreJavaApisStringAndStringBuilder;

/*
StringBuilder: la moi doi tuong bien doi (mutable)
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            // Moi lan "alpha += current" -> tao moi doi tuong moi trong String Pool
            // check bang cach print ra dia chi bo nho cua doi tuong
            //System.out.println("Dia chi bo nho cua" + alpha + " - la: " + System.identityHashCode(alpha));
        }
        System.out.println(alpha);

        StringBuilder beta = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) {
            beta.append(current);
            // Moi lan beta.append(current) -> khong tao doi tuong moi ma thay doi gia tri doi tuong cu
            // check bang cach print ra dia chi bo nho cua doi tuong
//            System.out.println("Dia chi bo nho cua" + beta + " - la: " + System.identityHashCode(beta));
        }
        System.out.println(beta);

        System.out.println("-------------- example 2 --------------");

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("Dia chi bo nho cua" + a + " - la: " + System.identityHashCode(a));
        System.out.println("a = " + a);
        System.out.println("Dia chi bo nho cua" + b + " - la: " + System.identityHashCode(b));
        System.out.println("b = " + b);

        // Khoi tao StringBuilder:
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);
        sb3.append(1);
        sb3.append(10000);
        sb3.append(" hello");
        System.out.println(sb3); // 10000 hello

    }
}
