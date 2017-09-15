
import java.sql.*;

public class dbcon 
    {
	
	            Connection con;
                            Statement st;
                            ResultSet rs;
dbcon()
{
	try{	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	                                con=DriverManager.getConnection("jdbc:odbc:networktraffic");
}catch(Exception e){System.out.println(e);}
}
	public String checkip(String ip)
	{ String s=null;	

		
		try{
			

		 st=con.createStatement();
		 rs=st.executeQuery("select * from sys where os='"+ip+"' ");

		 if(rs.next())
		
			{
			s="ok";
			}
			else
			{
			s="notok";	
			}
		}catch(Exception e){System.out.println(e);}
		
	return s;	
	}


public static void main(String arg[])
{
dbcon ob=new dbcon();
System.out.println(ob.checkip("Windows 2000"));
System.out.println(System.getProperty("os.name"));

}
                           
                  
 }
