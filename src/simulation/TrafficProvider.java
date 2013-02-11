/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.util.ArrayList;
import java.util.List;
import trafficElements.Lane;

/**
 *
 * @author przemo
 */
public class TrafficProvider {
    private List<Lane> lanes = null;

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
    
    public void setHarmonohram(){
        
    }
    
    public void generateVehicle(Lane l, int currentTime){
        
    }
}
