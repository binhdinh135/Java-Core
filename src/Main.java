
import java.util.Date;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        long max = 3123456789; // DOES NOT COMPILE
        Integer a = Integer.valueOf(1);
        System.out.println(a == 1);

        long max = 3123456789L; // now Java knows it is a long
        int million1 = 1000000;
        int million2 = 1_0_00_00_0;

        int million3 = 1_000_000;

        System.out.println(million1);
        System.out.println(million2);

        System.out.println(million3);
        Date date = new Date();
        System.out.println("Hello world!");
        Random r = new Random();
        System.out.println(r.nextInt(10));

        System.out.println(r.nextInt(100));


    }
}