import Kaijus.WaterKaiju;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterKaijuTest {

    WaterKaiju waterkaiju;
    Tank tank;

    @Before
    public void before() {
        waterkaiju = new WaterKaiju("Ebirah", 10, 10);
        tank = new Tank("Type 90", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Ebirah", waterkaiju.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(10, waterkaiju.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, waterkaiju.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rrrrrrroooooooaaaaaaarrrrrrr!!!!!!!", waterkaiju.roar());
    }

    @Test
    public void canMove() {
        assertEquals("Swimming ...", waterkaiju.move());
    }

    @Test
    public void canAttack() {
        waterkaiju.attack(tank);
        assertEquals(9, tank.getHealthValue());
    }

}
