/**
 * This package will be the single point of contact for any kind of connection requests to DB
 */
package com.triofoxes.project.ConnectionEstablish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author Vivek
 */
public class ConnectToDB {
	
	private static Connection cxn = null;
	
     /**
     * This class helps to connect with SQLite Database
     * 
     */
    private static Connection connectToSQLiteDB() {
        try {
            // setting up the path of the SQLite database
            String db_filepath = "jdbc:sqlite:processmonitor.db";
            
            // create a connection to the database
            cxn = DriverManager.getConnection(db_filepath);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        // make sure reception of this cxn requester is doing null check
        return cxn;
    }
    
    /**
     * This will the only point of connect from outside world to get connection instance of configured SQLite
     *      
     * @return Connection instance
     */
    public static Connection getSQLiteConnection() {
    	return connectToSQLiteDB();
    }
    
    /**
     * @param args command line args
     */
    public static void main(String[] args) {
    	System.out.print("cxn: " + getSQLiteConnection());
    }
}
