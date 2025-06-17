
// OracleCon1.java
// Program to demosntrate JDBC, retrieve (select) contents from table
import java.sql.*;

class OracleCon1 {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "comp");

            // step3 create the statement object
            Statement stmt = con.createStatement();

            // step 4,5: execute query and getting/traverses/processes results
            System.out.println("Following are the records in emp2 table\n");
            ResultSet rs = stmt.executeQuery("select * from emp2");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2));

            // step6 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}