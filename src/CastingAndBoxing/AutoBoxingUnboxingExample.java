package CastingAndBoxing;
/*
Từ Java 5 trở đi, Java hỗ trợ tự động boxing và unboxing.
Điều này có nghĩa là bạn không cần phải gọi các phương thức valueOf() hoặc intValue()
một cách thủ công, mà Java sẽ tự động thực hiện việc này.
 */

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        // Tự động boxing
        Integer boxedInt = 10; // Tương đương với Integer.valueOf(10)

        // Tự động unboxing
        int primitiveInt = boxedInt; // Tương đương với boxedInt.intValue()

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed int: " + primitiveInt);
    }

}
