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
    private Lane belongTo = null;
    private int timeToMove = 0;

    public Lane getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Lane belongTo) {
        this.belongTo = belongTo;
    }

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
        this.timeToMove=inertia;
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
        //assumed that the move is done within one unit of time, by which speed is specified
        System.out.println(getPosition());
        if(speed==0){
            timeToMove=inertia;
            return;
        }
        if(timeToMove>0){
            timeToMove-=1;
        } else {
            setPosition(position-speed); //position is subtracted to go to 0, which means the vehicle leaves the lane
        }
        notifyLane(belongTo);
        System.out.println(getPosition());
    }
    
    protected void notifyLane(Lane l){
        if (getPosition()<0 && l!=null){
            l.removeVehicle(this);
        }
    }
}
