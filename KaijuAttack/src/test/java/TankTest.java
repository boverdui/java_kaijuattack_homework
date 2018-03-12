import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before() {
        tank = new Tank("Type 90", 50);
    }

    @Test
    public void hasType() {
        assertEquals("Type 90", tank.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(10, tank.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        tank.takeDamage(10);
        assertEquals(40, tank.getHealthValue());
    }

}
