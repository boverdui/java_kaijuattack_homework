import Kaijus.LandKaiju;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LandKaijuTest {

    LandKaiju landkaiju;
    Tank tank;

    @Before
    public void before() {
        landkaiju = new LandKaiju("Gorosaurus", 10, 10);
        tank = new Tank("Type 90", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Gorosaurus", landkaiju.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(10, landkaiju.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, landkaiju.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rrrrrrroooooooaaaaaaarrrrrrr!!!!!!!", landkaiju.roar());
    }

    @Test
    public void canMove() {
        assertEquals("Walking ...", landkaiju.move());
    }

    @Test
    public void canAttack() {
        landkaiju.attack(tank);
        assertEquals(9, tank.getHealthValue());
    }

}
