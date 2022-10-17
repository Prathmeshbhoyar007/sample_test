package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CustomerDAO {
    private static final String TABLE_NAME = null;

    /**
     * 
     */
    public void createTable(){
        try{
            // 1. Load JDBC
            Class.forName("org.postgresql.Drive");

            // 2. Coonection
            Connection con = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgresql", "postgres", "pratham007");

            //  3. Create Statement object
            Statement stmt = (Statement) con.createStatement();

            // 4.Execute Query (statment)
            String sql = "Select * from "+ TABLE_NAME;
            ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
            // 5. Traverse ResultSet (data)
            while(rs.next()){
                System.out.println(" = "+ rs.getString("name"));
                System.out.println(" = "+ rs.getString("address"));
                System.out.println(" = "+ rs.getString("phone_number"));
                System.out.println(" = "+ rs.getString("city"));

            }
        }catch (Exception ex){
            ex.printStackTrace();

        }

}
}
