package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "root");
		Statement stat = con.createStatement();
//		stat.execute("create table pap (myoid int, ename varchar(20))");
		int rowsAffected = stat.executeUpdate("insert into employee values(6, 'Lenin', 'R', 45)");
	}

}
