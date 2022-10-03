package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Employee getConnect() throws SQLException {
		Employee e = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root",
					"SopraSteria@2025");
			String sql = "select * from emp1 where empId=704771";
			PreparedStatement ps = connect.prepareStatement(sql);
//			ps.setInt(1,704771);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				
				e.setEmpId((rs.getInt("empId")));
				e.setEmpName(rs.getString("empName"));
				e.setEmpEmail(rs.getString("empEmail"));
			}
			System.out.println(e);
			return e;
		}
		// return rs;
		catch (ClassNotFoundException k) {
			k.printStackTrace();
		}
		return e;

	}
}
