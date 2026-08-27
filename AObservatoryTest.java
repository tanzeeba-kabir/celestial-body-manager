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
public class AObservatoryTest {
  @Test
    public void testMostVisibleBody() {
        AObservatory obs1 = new AObservatory();
        CelestialBody a1 = new CelestialBody("Mars","planet",80,"stable",2024);
        CelestialBody b1 = new CelestialBody("CometX","comet",60,"irregular",2024);
        obs1.addBody(a1);
        obs1.addBody(b1);

        assertEquals(a1, obs1.getMostVisibleBody());
    }
    @Test
    public void testAverageVisibility() {

        AObservatory obs1 = new AObservatory();

        CelestialBody a1 = new CelestialBody("Mars","planet",80,"stable",2024);
        CelestialBody b1 = new CelestialBody("CometX","comet",60,"irregular",2024);

        obs1.addBody(a1);
        obs1.addBody(b1);

        assertEquals(70.0,obs1.getAverageVisibility(),0.01);
    }
    
}
