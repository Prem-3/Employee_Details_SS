package com.database.details;
import com.database.Employee;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.database.DatabaseConnection;

@Controller
public class Employeedetails {
	@RequestMapping("/employee")
	public String Employee(Model m) throws SQLException {
		m.addAttribute("emp",  DatabaseConnection.getConnect());
		return "employee";
		
	}
	
	
	@RequestMapping("/sopra")
	public String Organization() {
		return "sopra";
	}
}
