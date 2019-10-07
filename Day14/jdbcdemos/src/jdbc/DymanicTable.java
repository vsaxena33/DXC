package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;

import java.sql.Connection;

public class DymanicTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter emp id: ");int empId = scanner.nextInt();
		System.out.println("Enter emp name: ");String empName = scanner.next();
		System.out.println("Enter emp Address: ");String empAddress = scanner.next();
		System.out.println("Enter emp Salary: ");int empSalary = scanner.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "root");
		Statement stat = connection.createStatement();
	
		try {
			stat.execute("create table emp (empId int primary key , empName varchar(20), empAddress varchar(20), empSalary int)");
		}
		catch (Exception e) {
			
		}
		
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into emp value(?,?,?,?)");
		preparedStatement.setInt(1, empId);
		preparedStatement.setString(2, empName);
		preparedStatement.setString(3, empAddress);
		preparedStatement.setInt(4, empSalary);
		int rowsAffected = preparedStatement.executeUpdate();

	}

}
