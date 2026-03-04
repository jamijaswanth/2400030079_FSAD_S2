import java.sql.*;
class Hai{
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sec2","root","Jasu@7815");
		if(con != null)
			System.out.println("Connected Successfully");
		else
			System.out.println("Not Connected...");
		Statement stmt = con.createStatement();
		String vsql = "create table student(id int primary key,name varchar(25),email varchar(25))";
		int n = stmt.executeUpdate(vsql);
		System.out.println("value of n: " + n);
		con.close();
	}
}