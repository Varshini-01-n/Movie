import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Movies {
	public static void main(String args[])
	{
		try
		{
			Class c1=Class.forName("com.mysql.cj.jdbc.Driver");
			final String JdbcDriver="com.mysql.cj.jdbc.Driver";
			final String user="root";
			final String pass="8971122437";
			final String db_url="jdbc:mysql://127.0.0.1:3306/movies";
			Connection con=DriverManager.getConnection(db_url, user, pass);
			Statement stmt=con.createStatement();
			Scanner snr=new Scanner(System.in);
			System.out.println("Enter movie name : ");
			String s=snr.next();
			System.out.println("Enter actor name : ");
			String s1=snr.next();
			System.out.println("Enter actress name : ");
			String s2=snr.next();
			System.out.println("Enter director name : ");
			String s3=snr.next();
			System.out.println("Enter year of release : ");
			Integer s4=snr.nextInt();
			 int row=stmt.executeUpdate("insert into movies values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"');");
			 ResultSet rs1=stmt.executeQuery("select * from movies");
				System.out.println("Movie Details : ");
				while(rs1.next())
				{
					System.out.println("Movie name : "+rs1.getString(1)+" Actress :"+rs1.getString(3)+" Director: "+rs1.getString(4)+"Year of release : "+rs1.getInt(5));
				}
			 ResultSet rs=stmt.executeQuery("select * from movies");
			System.out.println("Enter actor name to find his movies");
			String y=snr.next();
			while(rs.next())
			{
				if((rs.getString(2).equals(y))==true)
				System.out.println("Movie name : "+rs.getString(1));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Movie name already exists!!!");
		}
	}
}
