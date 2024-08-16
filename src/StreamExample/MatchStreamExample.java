package StreamExample;

import java.util.Arrays;
import java.util.List;

public class MatchStreamExample {
    // match() operation returns a boolean depending upon the condition applied on
    // stream data
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript","Java","Java");
        boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("Java"));
        System.out.println(result); // true
//        TestClass test = new TestClass();
//        test.setName("binh.dc");
//        Class<?> clazz = test.getClass();
//        Field[] fields = clazz.getDeclaredFields();
//        Field field = clazz.getDeclaredField("name");
//        System.out.println(field.getName());
//        field.setAccessible(true);
//        System.out.println(field.get(test));
    }

}
