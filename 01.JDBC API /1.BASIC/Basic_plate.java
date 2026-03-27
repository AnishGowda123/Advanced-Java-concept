import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Basic_plate {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/";
		String usn="postgres";
		String pwd="root";
		String query="create database jdbcbasic";
		String driver="org.postgresql.Driver";
        try {
            Class.forName(driver);
             Connection connection= DriverManager.getConnection(url,usn,pwd);
             Statement statement= connection.createStatement();
              boolean res = statement.execute(driver);
              System.out.println(res); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
