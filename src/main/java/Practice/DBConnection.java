package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@edc1x3-scan2.exacc.ford.com:1521/GVMMODQ2";
		String userName = "PRX_GVMSMODQA2_APPL";
		String password = "Ford_2021";
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM GVMSMODQA2.pgvmk01_region");
		
		/*
		 * spring.datasource.url=jdbc:oracle:thin:@edc1x3-scan2.exacc.ford.com:1521/GVMMODQ2
		   spring.datasource.username=PRX_GVMSMODQA2_APPL
		   spring.datasource.password=Ford_2021
		 */
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1)+ " | "+resultSet.getString(2)+ " | " +resultSet.getTimestamp(4));
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}

}
