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
        waterkaiju = new WaterKaiju("Ebirah", 50, 5);
        tank = new Tank("Type 90", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Ebirah", waterkaiju.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(50, waterkaiju.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(5, waterkaiju.getAttackValue());
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
        assertEquals(45, tank.getHealthValue());
    }

}
