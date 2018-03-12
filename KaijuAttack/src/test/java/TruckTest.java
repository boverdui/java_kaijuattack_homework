import Vehicles.Truck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruckTest {

    Truck truck;

    @Before
    public void before() {
        truck = new Truck("Toyota Type 73", 5);
    }

    @Test
    public void hasType() {
        assertEquals("Toyota Type 73", truck.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(5, truck.getHealthValue());
    }

    @Test
    public void canTakeDamnmage() {
        truck.takeDamage();
        assertEquals(4, truck.getHealthValue());
    }

}
