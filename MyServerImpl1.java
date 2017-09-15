//Server program

import java.rmi.*;
import java.rmi.server.*;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.StringReader;
import java.sql.*;
import java.lang.*;
import java.util.StringTokenizer;
import java.net.InetAddress;

public class MyServerImpl1 extends UnicastRemoteObject implements MyInterface1
{
	public MyServerImpl1() throws RemoteException 
	{
		super();
	}

	public static void main(String args[])
	{
		try 
		{
			String host1="127.0.0.1";
			InetAddress a=InetAddress.getLocalHost();	
			//host1=a.getHostName();

			MyServerImpl1 instance = new MyServerImpl1();
			Naming.rebind("MyServerImpl1",instance);
			System.out.println(host1+" registered with RMI registry!");
		}
		catch (Exception ex2)
		{
			System.out.println("RMI Exception : " +ex2+"\n");
		}
	}

	public void alpha()throws RemoteException 
	{
		//login1.stat=1;
		System.out.println("dsfs");	
	}
}		
		
