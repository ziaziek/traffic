/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficElements;

/**
 *
 * @author przemo
 */
public class Vehicle {
    
    private int length=0;
    private int inertia=0;
    private int whereTo=0;
    private int position = -1;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getInertia() {
        return inertia;
    }

    public void setInertia(int inertia) {
        this.inertia = inertia;
    }

    public int getWhereTo() {
        return whereTo;
    }

    public void setWhereTo(int whereTo) {
        this.whereTo = whereTo;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public void move(int speed){
        
    }
}
