/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aobservatory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kabir
 */
public class AObservatory {
 private List<CelestialBody> bodies;
 private int currentYear;
 
public AObservatory() {
    bodies = new ArrayList<>();
    currentYear = 0;
}

public void addBody(CelestialBody body) {
    bodies.add(body);
}

public CelestialBody getMostVisibleBody(){
    CelestialBody maxV = null;
    for(CelestialBody body : bodies){
    if(maxV == null || body.getVisibility() > maxV.getVisibility()){
        maxV = body;
    }
}
    return maxV;
}
public List<CelestialBody> getRiskyBodies(){
  List<CelestialBody> riskyBodies = new ArrayList<>();
    for (CelestialBody body : bodies) {
        if(body.isRisky()) {
            riskyBodies.add(body);
        }
    }
    return riskyBodies;
  

}
public CelestialBody getMostVisibleRiskyBody() {
    CelestialBody max = null;

    for (CelestialBody body : bodies) {
        if (body.isRisky()) {
            if (max == null || body.getVisibility() > max.getVisibility()) {
                max = body;
            }
        }
    }

    return max;
}
public double getAverageVisibility() {
    //Returns the average visibility of all celestial bodies in the observatory
    if (bodies.isEmpty()) {
        return 0;
    }
    int sum = 0;
    for (CelestialBody body : bodies) {
        sum += body.getVisibility();
    }

    return (double) sum / bodies.size();
}
    
}
