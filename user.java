
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.sql.*;
import java.lang.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.util.Vector;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.util.*;
import java.util.Date;
import java.util.Vector;
import java.io.FileOutputStream;
import java.io.BufferedReader;

public class user
{
MinWin mw1=null;
MinWin mw=null;
public void warningDisplay(String host,String warn) throws RemoteException
	{
		try
		{
			int x=0;
			ListModel lm1=MinWin.warning.getModel();
			String d1[]=new String[lm1.getSize()+1];
			for(x=0;x<lm1.getSize();x++)
			{
				d1[x]=lm1.getElementAt(x).toString();
			}
			d1[x]=warn;
			MinWin.warning.setListData(d1);

			ListModel lm2=MinWin.action.getModel();
			String d2[]=new String[lm2.getSize()+1];
			for(x=0;x<lm2.getSize();x++)
			{
				d2[x]=lm2.getElementAt(x).toString();
			}
			d2[x]=host+"//killed Process";
			MinWin.action.setListData(d2);

			ListModel lm3=MinWin.message.getModel();
			String d3[]=new String[lm3.getSize()+2];
			for(x=0;x<lm3.getSize();x++)
			{
				d3[x]=lm3.getElementAt(x).toString();
			}
			d3[x++]="Warning//"+warn+("Intruder");
			d3[x]="Action//"+host+"//killed Process";	
			MinWin.message.setListData(d3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

public String getConnect(String username,String password,int date,int day,String host) throws RemoteException
	{
		String temp4="";

		try 
		{
			mw1=mw;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:networktraffic");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from detail where username='"+username+"' and password='"+password+"'"); 	
			if(rs.next())
			{
				StringTokenizer token=new StringTokenizer(rs.getString(8),",");
				int k=1;
				while(token.hasMoreTokens())
				{	
					int day1= Integer.parseInt(token.nextToken());
					int time1=Integer.parseInt(token.nextToken());
					int time2=Integer.parseInt(token.nextToken());
					System.out.println(day1+time1+time2);
					if(day1==day)
					{
						if((date>time1) && (date<time2))
						{
							temp4=temp4+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7);
						}
						else
						{
							temp4="Denied";
							int x=0;
							ListModel lm1=MinWin.warning.getModel();
							String d1[]=new String[lm1.getSize()+1];
							for(x=0;x<lm1.getSize();x++)
							{
								d1[x]=lm1.getElementAt(x).toString();
							}
							d1[x]=host+"//user level warning//Untime Login Request";
							MinWin.warning.setListData(d1);

							ListModel lm2=MinWin.action.getModel();
							String d2[]=new String[lm2.getSize()+1];
							for(x=0;x<lm2.getSize();x++)
							{
								d2[x]=lm2.getElementAt(x).toString();
							}
							d2[x]=host+"//Login Permission Denied";
							MinWin.action.setListData(d2);
	
							ListModel lm3=MinWin.message.getModel();
							String d3[]=new String[lm3.getSize()+2];
							for(x=0;x<lm3.getSize();x++)
							{
								d3[x]=lm3.getElementAt(x).toString();
							}
							d3[x++]="Warning//"+host+"//user level warning//Untime Login Request"+" Intruder";
							d3[x]="Action//"+host+"//Login Permission Denied";	
							MinWin.message.setListData(d3);
						}
					}
				}

			}
			else
			{
				int r=mw1.myoptionpane("Intruder Detected.Destroy it","User Level Agent Warning");
				if(r==0)
				{
					temp4="Exit";
					warningDisplay(host,host+"//User level Exception//Trying to match password");
					int x=0;
					ListModel lm1=MinWin.hostname.getModel();
					String d1[]=new String[lm1.getSize()-1];
					for(x=0;x<lm1.getSize();x++)
					{
						if(!(lm1.getElementAt(x).toString()).equals(host))
						{
							d1[x]=lm1.getElementAt(x).toString();
						}
					}
					MinWin.hostname.setListData(d1);
					MinWin.hostname1.setListData(d1);
				}
				else
				{
					temp4="null";
				}
			}
		}
		catch (Exception ex2)
		{
			System.out.println(ex2);
		}
		return temp4;	
	}

} 