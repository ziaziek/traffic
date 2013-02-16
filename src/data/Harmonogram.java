/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author przemo
 */
public class Harmonogram {
    
    private ArrayList<HarmonogramEntry> entries = null;
    
    public void loadData(ReadAdapter reader){
        try {
            if (entries==null)
                entries = new ArrayList<HarmonogramEntry>();
            reader.openConnection();
            entries.clear();
            //read all the data into the entries list
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        } finally {
            reader.closeConnection();
        }
    }
    
    public HarmonogramEntry getNumberOfVehicles(double time){
        HarmonogramEntry ret = new HarmonogramEntry();
        ret.hourTime = 0;
        if(!entries.isEmpty()){
            int index = 0; int s = entries.size();
            while(index<s && entries.get(index).hourTime< time){
                index++;
            }
           if(entries.get(index).hourTime == time){
               return entries.get(index);
           }
            if(index==s){
                ret.largeVehiclesPercentage = 0.5*(entries.get(0).largeVehiclesPercentage+entries.get(s-1).largeVehiclesPercentage);
                ret.numberOfVehicles = (int)(0.5*(entries.get(0).numberOfVehicles+ entries.get(s).numberOfVehicles));
                return ret;
            } else {
                if(index>0){
                    ret.largeVehiclesPercentage = 0.5*(entries.get(index).largeVehiclesPercentage+entries.get(index-1).largeVehiclesPercentage);
                    ret.numberOfVehicles = (int)(0.5*(entries.get(index).numberOfVehicles+ entries.get(index-1).numberOfVehicles));
                }
                return ret;
            }
        }
        ret.largeVehiclesPercentage = 0;
        ret.numberOfVehicles = 0;
        return ret;
    }
    
    public double getSmallVehiclesRation(double time){
        return 0;
    }
}
