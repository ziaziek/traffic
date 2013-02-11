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
public class Lane {
    
    private int length=0;
    private int capacity = 0;
    private Directions direction;
    private List<Vehicle> vehicles = null;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        if(vehicle==null){
            return;
        }
        if(vehicles==null){
            vehicles = new ArrayList<Vehicle>();
        }
        vehicles.add(vehicle);
    }
    
    
    public void removeVehicle(Vehicle v){
        if(vehicles!=null && !vehicles.isEmpty() && v!=null && vehicles.contains(v)){
            vehicles.remove(v);
        }
    }
    
    public void removeFirstVehicle(){
        if(vehicles!=null && !vehicles.isEmpty() && vehicles.size()>0){
            vehicles.remove(0);
        }
    }
}
