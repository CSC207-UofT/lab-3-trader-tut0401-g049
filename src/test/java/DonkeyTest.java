import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonkeyTest {
    Donkey h;

    @Before
    public void setUp() throws Exception {
        h = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hee-haw!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0.5, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(1, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, h.getPrice());
    }

}