package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.messaging.handler.invocation.ReactiveReturnValueHandler;

public class LoginControllerDriver {
	
	public boolean validateCredentials(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException, SQLException {
		
		String emailId = req.getParameter("emailId");
		String password = req.getParameter("password");
		
		String url="jdbc:mysql://localhost:3306/college";
        String uN="root";
        String pw="root.root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, uN, pw);
		
		PreparedStatement statement=connection.prepareStatement("select email,password from student where email like ?");
		
		statement.setString(1, "%"+emailId+"%");
		
		ResultSet result1=statement.executeQuery();
		
		
		boolean response=true;
		
		while(result1.next()) {
			
			if(emailId.equals(result1.getString("email")) && password.equals(result1.getString("password")))
				response=  true;
			else
				response=false;
			
		}
			return response;
	}
	
}
