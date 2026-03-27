
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/";
		String usn="postgres";
		String pwd="root";
		String query="create database jdbcbasic";
		String name="org.postgresql.Driver";
		
		try {
			Class.forName(name);//1) load and register
			
			Connection connection = DriverManager.getConnection(url, usn, pwd);//2)establish the connection
			
			Statement statement = connection.createStatement();//3)Create a statement
			
			boolean result = statement.execute(query);//4)Excuting the Statment/Query
			System.out.println(result);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}