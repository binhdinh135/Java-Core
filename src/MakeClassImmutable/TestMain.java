package MakeClassImmutable;

public class TestMain {
    public static void main(String[] args) {
        Address address = new Address("Dinh Cong", "Ha Noi");
        Person person = new Person("Dinh Cong Binh",11, address);
        System.out.println(person.getAddress());
    }
}
