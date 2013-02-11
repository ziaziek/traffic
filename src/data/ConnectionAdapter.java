/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author przemo
 */
public abstract class ConnectionAdapter {
    private String connectionString = null;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public abstract boolean openConnection();
    
    public abstract void closeConnection();
}
