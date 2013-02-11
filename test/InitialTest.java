/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import data.*;
import java.util.HashSet;
import java.util.Set;
import simulation.*;
import trafficElements.*;
import trafficsimulation.*;

/**
 *
 * @author przemo
 */
public class InitialTest {
    
    public InitialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void laneElements(){
        int limit = 5;
        Lane l = new Lane();
        l.setCapacity(100);
        l.setDirection(Directions.IN);
        l.setLength(150);
        for (int i=0; i<limit; i++){
          l.addVehicle(new Vehicle());  
        }
        assertEquals(100, l.getCapacity());
        assertEquals(150, l.getLength());
        assertEquals(Directions.IN , l.getDirection());
        assertNotNull(l.getVehicles());
        assertEquals(limit, l.getVehicles().size());
    }
    
    private Vehicle getVehicle(){
        Vehicle v = new Vehicle();
        v.setInertia(2);
        v.setLength(1);
        v.setPosition(0);
        v.setWhereTo(3);
        return v;
    }
    
    @Test 
    public void vehicleCreation(){
        Vehicle v = getVehicle();
        v.move(30);
        assertNotNull(v);
        assertEquals(3, v.getWhereTo());
        assertEquals(2, v.getInertia());
        assertEquals(1, v.getLength());
        assertEquals(0, v.getPosition());
    }
    
    @Test
    public void vehicleMove(){
        Vehicle v = getVehicle();
        v.move(30);
        assertNotNull(v);
    }
}
