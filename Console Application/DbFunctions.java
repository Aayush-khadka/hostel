import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbFunctions {
    public Connection connect_to_db(String dbname,String username,String password)
    {
        Connection conn=null;
        try {
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,username,password);
            if (conn!=null){
                System.out.println("Connection Established");
            }
            else {
                System.out.println("Unable to Establish Connection");
            }
        }
        catch (ClassNotFoundException | SQLException e)
        {
            throw new RuntimeException(e);
        }

        return conn;
    }


}
