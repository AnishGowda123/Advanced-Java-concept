import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/jdbcbasic";
		String usn="postgres";
		String pwd="root";
		String query="create table  students (id integer primary key,name varchar(100) not null,age integer not null check (age >= 21))";
		String name="org.postgresql.Driver";

        try {
            Class.forName(name);

            Connection connection = DriverManager.getConnection(url,usn,pwd);

            Statement statement= connection.createStatement();

            int res =statement.executeUpdate(query);
            System.out.println(res); 

        } catch (ClassNotFoundException | SQLException e) {
           e.getStackTrace();
        }
    }
}
