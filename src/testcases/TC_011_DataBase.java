package testcases;

import java.sql.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_011_DataBase {
	
	@Test
	public void verifyDataBase() {
		try {
			// Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CURA_Healthcare", "root", "Jaiarun45@2288");
			Statement st = connection.createStatement(); // Create Statement
			ResultSet rs = st.executeQuery("select*from Login_data"); // Execute Query

			while (rs.next()) {
				String string = rs.getString(2); // to get and store the User_Name
				String string2 =rs.getString(3); // to get and store the User_Password
				
				Assert.assertEquals(string, "John Doe"); // verify the User_Name
				Assert.assertEquals(string2, "ThisIsNotAPassword"); // verify the User_Password
			}
		} catch (Exception e) {
			System.out.println(e.toString()); // to print the exception message
		}
	}
	}