/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TankTest {
    Tank t;

    @Before
    public void setUp() {
        t = new Tank();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(4, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(2, t.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, t.getPrice());
    }

}
