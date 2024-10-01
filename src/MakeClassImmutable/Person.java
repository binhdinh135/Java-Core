package MakeClassImmutable;

public class Person {
    private final String name;
    private final int age;
    private final Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getStreet(), address.getCity()); // create a copy of the address object
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return "Street: " + address.getStreet() + ", City: " + address.getCity();
    }
}
