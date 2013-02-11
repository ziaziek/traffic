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
public class Junction {
    
    private JunctionCentre centre = null;

    private List<Driveway> driveways = null;
    
    public JunctionCentre getCentre() {
        return centre;
    }

    public void setCentre(JunctionCentre centre) {
        this.centre = centre;
    }

    public List<Driveway> getDriveways() {
        return driveways;
    }

    public void addDriveway(Driveway d) {
        if(d==null){
            return;
        }
        if(driveways==null){
            driveways = new ArrayList<Driveway>();
        }
        driveways.add(d);
    }
 
}
