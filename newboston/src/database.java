package jdbc;
import java.sql.*;

public class database
{
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testDB",
                    "postgres", "root");
            System.out.println("Opened database successfully");
            stmt = con.createStatement();
            String query = "CREATE TABLE Students " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " Roll           VARCHAR NOT NULL)";
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}
