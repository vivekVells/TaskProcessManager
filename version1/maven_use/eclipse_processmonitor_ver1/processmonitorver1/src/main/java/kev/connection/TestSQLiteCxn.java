/**
 * 
 */
package kev.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Vivek
 * 
 * Connection testing 
 * 
 * File reference/headsup notes: TaskProcessManager\resource_house\reference\NotesHub\version1-maven_use-eclipse_processmonitor_ver1-processmonitorver1\thingsToRemember.txt
 */
public class TestSQLiteCxn {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {

      Connection cxn = ConnectToDB.getSQLiteConnection();
	
	  Statement statement = cxn.createStatement();
	  statement.setQueryTimeout(30);  // set timeout to 30 sec.
	
	  statement.executeUpdate("drop table if exists person");
	  statement.executeUpdate("create table person (id integer, name string)");
	  statement.executeUpdate("insert into person values(1, 'Vivek Vells')");
	  statement.executeUpdate("insert into person values(2, 'RedOxes')");
	  ResultSet rs = statement.executeQuery("select * from person");
	  
	  while(rs.next())
	  {
	    // read the result set
	    System.out.println("name = " + rs.getString("name"));
	    System.out.println("id = " + rs.getInt("id"));
	  }
	}
}


/*
Output:

Connection to SQLite has been established.
name = Vivek Vells
id = 1
name = RedOxes
id = 2

 */