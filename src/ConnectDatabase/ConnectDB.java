package ConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static  Connection connectionDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/bakery", "root", "");
            System.out.println("connect sucessfully");
            return connect;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}