import Vehicles.Truck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruckTest {

    Truck truck;

    @Before
    public void before() {
        truck = new Truck("Toyota Type 73", 10);
    }

    @Test
    public void hasType() {
        assertEquals("Toyota Type 73", truck.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(10, truck.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        truck.takeDamage(10);
        assertEquals(0, truck.getHealthValue());
    }

}
