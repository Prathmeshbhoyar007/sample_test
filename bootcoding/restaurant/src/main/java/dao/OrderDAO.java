package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OrderDAO {
    public static final String TABLE_NAME = "app_order";
    public void createTable(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "pratham007@");
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL, "
                    + " vendor_id bigint ,"
                    + " customer_id bigint, "
                    + " total_amount decimal, "
                    + " order_date timestamp , "
                    + " status text, "
                    + " delivery_address text, "
                    + " category text, "
                    + " CONSTRAINT app_order_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
