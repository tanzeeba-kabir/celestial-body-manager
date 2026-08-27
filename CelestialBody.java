/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aobservatory;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kabir
 */
public class CelestialBody {
private String name; // name of celestial body
private String type; // type of celestial body
private int visibility; // visivility score
private boolean risky; // risk factor
private String orbit; // orbit type
private int lastYear; // when it was observed last year
private List<Integer> prevHistory; // prev visibility score 

// constructor part which creates object 
public CelestialBody(String name, String type, int visibility, String orbit, int lastYear) {
    this.name = name;
    this.type = type;
    this.visibility = visibility;
    this.orbit = orbit;
    this.lastYear = lastYear;
    this.risky = false;
    this.prevHistory = new ArrayList<>();
    this.prevHistory.add(visibility);
}
public void newVisibility(){
    if(orbit.equals("elliptical")||orbit.equals("irregular")){
        visibility = visibility -5;
    }
     prevHistory.add(visibility); // checks orbit type and reduces visibilty by 5
}
public int getVisibility() {
    return visibility;
}
public void checkRisk(){
    if(!orbit.equals("irregular")||prevHistory.size() < 6){
        return;
    }
    int size = prevHistory.size();
     if (prevHistory.get(size-6) > prevHistory.get(size-5) &&
        prevHistory.get(size-5) > prevHistory.get(size-4) &&
        prevHistory.get(size-4) > prevHistory.get(size-3) &&
        prevHistory.get(size-3) > prevHistory.get(size-2) &&
        prevHistory.get(size-2) > prevHistory.get(size-1)) {
        risky = true;
    }
     // checks if the body is risky or not - irregular orbit and visi is -5 years
}
public boolean isRisky() {
    return risky;
}
public boolean isObsolete() {
// If the visibility score is below 20 for three consecutive years, the celestial body becomes obsolete
    if (prevHistory.size() < 3) {
        return false;
    }

    int size = prevHistory.size();

    return prevHistory.get(size-1) < 20 &&
           prevHistory.get(size-2) < 20 &&
           prevHistory.get(size-3) < 20;
 
}

}
