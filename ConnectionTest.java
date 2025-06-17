
//ConnectionTest.java
// This program tests JDBC driver loading and database connection establishment
import java.sql.*;
class ConnectionTest{ 
public static void main(String args[]){
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
 System.out.println("Driver loaded");
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","comp");
 System.out.println("Connection to database established");
  con.close();      // close theconnection to database
  System.out.println("Connection to database closed"); 
}catch(ClassNotFoundException e){
 System.out.println("Driver not found");
 } catch(SQLException e){
   System.out.println("Connection not established");
   }
 }
}