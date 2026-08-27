/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package aobservatory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kabir
 */
public class CelestialBodyTest {
    @Test
    public void testVisibilityDecrease() {

        CelestialBody body = new CelestialBody("CometX", "comet", 60, "irregular", 2024);

        body.newVisibility();

        assertEquals(55, body.getVisibility());
    }

    @Test
    public void testBodyBecomesObsolete() {

        CelestialBody body = new CelestialBody("AsteroidA", "asteroid", 18, "irregular", 2024);

        body.newVisibility();
        body.newVisibility();

        assertTrue(body.isObsolete());
    }  
    
}
