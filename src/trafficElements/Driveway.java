/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficElements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author przemo
 */
public class Driveway {
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
    }
}
