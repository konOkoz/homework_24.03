import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Есть два класса: Address с полями String street и int houseNumber и Person с полями String name и Address address.
        Нужно написать метод List< Address > getAddresses(List persons) то есть по списку persons метод будет возвращать список их адресов.
        Протестировать его.
         */

        Person person1 = new Person("John",new Address("Berliner str.",7));
        Person person2 = new Person("Jack",new Address("Liepmannweg",45));
        Person person3 = new Person("Jana",new Address("Holz",14));
        Person person4 = new Person("Ann",new Address("Strasse",1));
        List<Person> persons = List.of(person1,person2,person3,person4);

        System.out.println(getAddresses(persons));



    }
    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            addresses.add(persons.get(i).getAddress());
        }
        return addresses;
    }

}