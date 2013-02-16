/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import data.Harmonogram;
import java.util.ArrayList;
import java.util.List;
import trafficElements.Lane;
import trafficElements.Vehicle;

/**
 *
 * @author przemo
 */
public class TrafficProvider {
    private List<Lane> lanes = null;
    private Harmonogram harmonogram = null;

    public Harmonogram getHarmonogram() {
        return harmonogram;
    }

    public void setHarmonogram(Harmonogram harmon) {
        this.harmonogram = harmon;
    }
    
    public List<Lane> getLanes() {
        return lanes;
    }
    
    public void addLane(Lane l){
        if(l==null){
            return;
        }
        if(lanes==null){
            lanes = new ArrayList<Lane>();    
        }
        lanes.add(l);
    }
    
    
    public void generateVehicle(Lane l, double currentTime){
        for(int i=0; i<harmonogram.getNumberOfVehicles(currentTime).numberOfVehicles; i++){
            l.addVehicle(new Vehicle());
        }
    }
}
