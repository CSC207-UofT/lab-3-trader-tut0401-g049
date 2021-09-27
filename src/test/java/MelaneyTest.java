/*
 * This file contains sample JUnit test cases for Melaney.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MelaneyTest {
    Melaney h;

    @Before
    public void setUp() throws Exception {
        h = new Melaney();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hello World", h.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, h.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, h.getPrice());
    }

}
