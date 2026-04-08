import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the id :");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter the name :");
		String name = sc.nextLine();

		System.out.println("enter the age :");
		int age = sc.nextInt();
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcbasic?user=postgres&password=root");
			PreparedStatement preparedStatmenmt=connection.prepareStatement("insert into students values(?,?,?)");
			preparedStatmenmt.setInt(1, id);
			preparedStatmenmt.setString(2, name);
			preparedStatmenmt.setInt(3, age);
			int res=preparedStatmenmt.executeUpdate();
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}