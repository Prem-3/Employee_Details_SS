//package com.database;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DAO {
//	public List<Employee> AllUser() {
////		List<Employee> listuser = new ArrayList<Employee>();
//		Employee emp=new Employee();
//		String sql = "select * from emp1 ";
//		try {
//			PreparedStatement st = DAO.getConnect().prepareStatement(sql);
//			
//			ResultSet res = st.executeQuery();
//			while (res.next()) {
//				emp.setEmpId(res.getInt("empId"));				
//				emp.setEmpName(res.getString("empName"));				
//				emp.setEmpEmail(res.getString("empEmail"));				
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return emp;
//	}
//}
