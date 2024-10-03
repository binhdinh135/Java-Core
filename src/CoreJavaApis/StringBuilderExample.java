package CoreJavaApis;

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

    }
}
