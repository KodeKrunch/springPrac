package driver;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SubmitControllerDriver  {

	public void addStudentDetails(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException, SQLException {
		
		String userName= req.getParameter("userName");
		String password= req.getParameter("password");
		String studentName= req.getParameter("studentName");
		String cityName= req.getParameter("cityName");
		String stateName= req.getParameter("stateName");
		String pincode =req.getParameter("pincode");
		String emailId=req.getParameter("emailId");
		String mobile=req.getParameter("mobile");
		
		String url="jdbc:mysql://localhost:3306/college";
        String uN="root";
        String pw="root.root";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection= DriverManager.getConnection(url, uN, pw);
        
        PreparedStatement statement= connection.prepareStatement("INSERT INTO student (password,name,city,state,pin,email,mobile) values (?,?,?,?,?,?,?)");
		
        
        statement.setString(1, password);
        statement.setString(2, studentName);
        statement.setString(3, cityName);
        statement.setString(4, stateName);
        statement.setString(5, pincode);
        statement.setString(6, emailId);
        statement.setString(7, mobile);
        
        statement.execute();
        
        statement.close();
        connection.close();
  
	}
	
}


