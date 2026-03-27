import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/database";
		String usn="postgres";
		String pwd="root";
		String query="insert into students values(104,'rajesh',28)";
		String name="org.postgresql.Driver";

        try {
            Class.forName(name);

            Connection connection = DriverManager.getConnection(url,usn,pwd);

            Statement statement= connection.createStatement();

            int res =statement.executeUpdate(query);
            System.out.println(res);  

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
        }
    }
}
