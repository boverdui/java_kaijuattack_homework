import Kaijus.AirKaiju;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirKaijuTest {

    AirKaiju airkaiju;
    Tank tank;

    @Before
    public void before() {
        airkaiju = new AirKaiju("Kamacuras", 100, 10);
        tank = new Tank("Type 90", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Kamacuras", airkaiju.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, airkaiju.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, airkaiju.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rrrrrrroooooooaaaaaaarrrrrrr!!!!!!!", airkaiju.roar());
    }

    @Test
    public void canMove() {
        assertEquals("Flying ...", airkaiju.move());
    }

    @Test
    public void canAttack() {
        airkaiju.attack(tank);
        assertEquals(40, tank.getHealthValue());
    }

}
