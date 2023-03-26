import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetAddressTest {

   @Test
    public void getAddresses_testingHowToWork(){
        List<Person> ourList = List.of(new Person("John",new Address("address",1)),new Person("Jack",new Address("add",3)));
        List<Address> expected = List.of(new Address("address",1),new Address("add",3));
        List<Address> actual = Main.getAddresses(ourList);



        assertEquals(expected.toString(), actual.toString());
    }


}
