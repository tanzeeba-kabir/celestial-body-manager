/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aobservatory;

/**
 *
 * @author kabir
 */
public class Main {
    public static void main(String[] args){
       AObservatory observatory = new AObservatory();  
       CelestialBody earth = new CelestialBody("Earth", "planet", 90, "stable", 2024);
       CelestialBody asteroid = new CelestialBody("Apophis", "asteroid", 55, "irregular", 2023);
       observatory.addBody(earth);
       observatory.addBody(asteroid);
       IO.println(observatory.getMostVisibleBody());
       IO.println(observatory.getAverageVisibility());
    }
}
