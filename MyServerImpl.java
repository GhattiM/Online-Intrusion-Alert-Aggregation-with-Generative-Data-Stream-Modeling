// Decompiler options: packimports(3) 
// Source File Name:   MyServerImpl.java

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class MyServerImpl extends UnicastRemoteObject
    implements MyInterface, ActionListener
{

    public MyServerImpl()
        throws RemoteException
    {
        pro = new Hashtable();
        pro.put("admin", "p1");
        pro.put("eee", "p2");
        mw1 = null;
    }

    public static void main(String args[])
    {
        try
        {
            String s = "";
            (new emserver()).start();
            InetAddress inetaddress = InetAddress.getLocalHost();
            MyServerImpl myserverimpl = new MyServerImpl();
            s = inetaddress.getHostName();
            System.out.println(s);
            String s1 = "//localhost/MyServerImpl";
            String s2 = (new StringBuilder()).append(s).append(" registered with RMI registry!").toString();
            Naming.rebind(s1, myserverimpl);
            System.out.println(s2);
            mw = new MinWin();
            mw.setTitle("Layered Approach Using Conditional Random Fields for Intrusion Detection");
            mw.setDefaultCloseOperation(3);
            mw.setSize(800, 600);
            mw.setVisible(true);
            mw.setResizable(false);
        }
        catch(Exception exception)
        {
            System.out.println((new StringBuilder()).append("RMI Exception : ").append(exception).append("\n").toString());
        }
    }

    public String getpro(String s)
        throws RemoteException
    {
        String as[] = {
            "Process  level Agent Activated"
        };
        MinWin.status.setListData(as);
        Vector vector = new Vector();
        String s1 = "";
        try
        {
            if(pro.get(userpro).equals(s))
            {
                if(s.equals("p1"))
                {
                    Properties properties = System.getProperties();
                    Enumeration enumeration = properties.propertyNames();
                    String s2;
                    for(s1 = ""; enumeration.hasMoreElements(); s1 = (new StringBuilder()).append(s1).append(s2).append("=").append(properties.getProperty(s2)).append("\n;").toString())
                        s2 = (String)enumeration.nextElement();

                    System.out.println((new StringBuilder()).append("process ok").append(s1).toString());
                }
                if(s.equals("p2"))
                    s1 = "MSG FROM SERVER";
            } else
            {
                emserver.msg = "RESOURCE MISUSE-Intruder Detected.";
                System.out.println((new StringBuilder()).append(emserver.msg).append("Msg SENDED TO MOBILE").toString());
                String as1[] = {
                    "//Process level warning//Process level(unAuthorized Process) Request"
                };
                MinWin.warning.setListData(as1);
                String as2[] = {
                    (new StringBuilder()).append("Action//").append(userpro).append("//process access Permission Denied").toString()
                };
                MinWin.message.setListData(as2);
                int i = mw1.myoptionpane("Process Level Intruder Detected.Destroy it", "Process Level Agent Warning");
                if(i == 0)
                {
                    String as3[] = {
                        "//Process level Permission Denied Killer Agent Called"
                    };
                    MinWin.action.setListData(as3);
                    s1 = "nak";
                }
                System.out.println((new StringBuilder()).append("process notok").append(i).toString());
            }
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        return s1;
    }

    public int sendPacket(Vector vector, int i, String s, int j, int k)
        throws RemoteException
    {
        int l;
        int i1;
        boolean aflag[];
        String s1;
        int k1;
        l = 9;
        i1 = 0;
        aflag = new boolean[i + 1];
        s1 = "";
        String as[] = {
            "Packet  level Agent Activated"
        };
        MinWin.status.setListData(as);
        if((j < 1500) & (k < 500))
        {
            l = 4;
            break MISSING_BLOCK_LABEL_376;
        }
        for(int j1 = 1; j1 <= i; j1++)
            aflag[j1] = false;

        k1 = 0;
_L3:
        if(k1 >= i)
         goto _L2; 
         else 
         goto _L1;
_L1:
        int i2 = ((Integer)vector.elementAt(i1)).intValue();
        i1++;
        int j2 = ((Integer)vector.elementAt(i1)).intValue();
        i1++;
        String s2 = (String)vector.elementAt(i1);
        i1++;
        int l2 = s2.hashCode();
        if(aflag[i2])
        {
            warningDisplay("", (new StringBuilder()).append("Packet Level Error/packet ").append(i2).append(" duplicated").toString());
            l = mw1.myoptionpane("Packets duplicated.\nIntruder Detected.\nDestroy it", "Packet Level Agent Warning");
            break; /* Loop/switch isn't completed */
        }
        try
        {
            System.out.println(s2);
        }
        catch(Exception exception1) { }
        k1++;
          goto _L3;
_L2:
        int l1 = 1;
        do
        {
            if(l1 > i)
                break;
            if(!aflag[l1])
            {
                warningDisplay("", (new StringBuilder()).append("Packet Level Error/packet ").append(l1).append(" Lost").toString());
                l = mw1.myoptionpane("Packets Lost.\nIntruder Detected.\nDestroy it", "Packet Level Agent Warning");
                break;
            }
            l1++;
        } while(true);
        if(l != 0)
            try
            {
                FileOutputStream fileoutputstream = new FileOutputStream(s);
                BufferedReader bufferedreader = new BufferedReader(new StringReader(s1));
                int k2;
                while((k2 = bufferedreader.read()) != -1) 
                    fileoutputstream.write((char)k2);
                fileoutputstream.close();
                bufferedreader.close();
            }
            catch(Exception exception) { }
        return l;
    }

    public String getConnect(String s, String s1, int i, int j, String s2, String s3)
        throws RemoteException
    {
        userpro = s;
        String s4 = "";
        try
        {
            System.out.println(s3);
            dbcon dbcon1 = new dbcon();
            String s5 = dbcon1.checkip(s2);
            if(s5.equals("ok"))
            {
                if(!s2.equals("36363"));
                s4 = "sysint";
                int k = 0;
                ListModel listmodel = MinWin.warning.getModel();
                String as[] = new String[listmodel.getSize() + 2];
                for(k = 0; k < listmodel.getSize(); k++)
                    as[k] = listmodel.getElementAt(k).toString();

                as[k] = (new StringBuilder()).append(s2).append("//System level warning//System level(unsupported OS) Request").toString();
                MinWin.warning.setListData(as);
                ListModel listmodel1 = MinWin.action.getModel();
                String as1[] = new String[listmodel1.getSize() + 1];
                for(k = 0; k < listmodel1.getSize(); k++)
                    as1[k] = listmodel1.getElementAt(k).toString();

                as1[k] = (new StringBuilder()).append(s2).append("//System level Permission Denied Killer Agent Called").toString();
                MinWin.action.setListData(as1);
                ListModel listmodel2 = MinWin.message.getModel();
                String as2[] = new String[listmodel2.getSize() + 2];
                for(k = 0; k < listmodel2.getSize(); k++)
                    as2[k] = listmodel2.getElementAt(k).toString();

                as2[k++] = (new StringBuilder()).append("Warning//").append(s2).append("//System level warning//UnSupported System Login Request").append(" Intruder").toString();
                as2[k] = (new StringBuilder()).append("Action//").append(s2).append("//System level Permission Denied Killer Agent Called").toString();
                MinWin.message.setListData(as2);
                ListModel listmodel4 = MinWin.warning.getModel();
                String as4[] = new String[listmodel4.getSize() + 1];
                for(i = 0; i < listmodel4.getSize(); i++)
                    as4[i] = listmodel4.getElementAt(i).toString();

                as4[i] = "//System level Agent Activated";
                MinWin.status.setListData(as4);
            } else
            {
                mw1 = mw;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection connection = DriverManager.getConnection("jdbc:odbc:networktraffic");
                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery((new StringBuilder()).append("select * from detail where username='").append(s).append("' and password='").append(s1).append("'").toString());
                if(resultset.next())
                {
                    StringTokenizer stringtokenizer = new StringTokenizer(resultset.getString(8), ",");
                    boolean flag = true;
                    do
                    {
                        if(!stringtokenizer.hasMoreTokens())
                            break;
                        int i1 = Integer.parseInt(stringtokenizer.nextToken());
                        int j1 = Integer.parseInt(stringtokenizer.nextToken());
                        int k1 = Integer.parseInt(stringtokenizer.nextToken());
                        System.out.println(i1 + j1 + k1);
                        if(i1 == j)
                            if(i > j1 && i < k1)
                            {
                                s4 = (new StringBuilder()).append(s4).append(resultset.getString(3)).append(",").append(resultset.getString(4)).append(",").append(resultset.getString(5)).append(",").append(resultset.getString(6)).append(",").append(resultset.getString(7)).toString();
                            } else
                            {
                                s4 = "Denied";
                                int i2 = 0;
                                ListModel listmodel5 = MinWin.warning.getModel();
                                String as5[] = new String[listmodel5.getSize() + 2];
                                for(i2 = 0; i2 < listmodel5.getSize(); i2++)
                                    as5[i2] = listmodel5.getElementAt(i2).toString();

                                as5[i2] = (new StringBuilder()).append(s2).append("//user level warning//Untime Login Request").toString();
                                MinWin.warning.setListData(as5);
                                ListModel listmodel6 = MinWin.action.getModel();
                                String as6[] = new String[listmodel6.getSize() + 1];
                                for(i2 = 0; i2 < listmodel6.getSize(); i2++)
                                    as6[i2] = listmodel6.getElementAt(i2).toString();

                                as6[i2] = (new StringBuilder()).append(s2).append("//Login Permission Denied").toString();
                                MinWin.action.setListData(as6);
                                ListModel listmodel7 = MinWin.message.getModel();
                                String as7[] = new String[listmodel7.getSize() + 2];
                                for(i2 = 0; i2 < listmodel7.getSize(); i2++)
                                    as7[i2] = listmodel7.getElementAt(i2).toString();

                                as7[i2++] = (new StringBuilder()).append("Warning//").append(s2).append("//user level warning//Untime Login Request").append(" Intruder").toString();
                                as7[i2] = (new StringBuilder()).append("Action//").append(s2).append("//Login Permission Denied").toString();
                                MinWin.message.setListData(as7);
                            }
                    } while(true);
                } else
                {
                    int l = mw1.myoptionpane("Intruder Detected.Destroy it", "User Level Agent Warning");
                    if(l == 0)
                    {
                        s4 = "Exit";
                        warningDisplay(s2, (new StringBuilder()).append(s2).append("//User level Exception//Trying to match password").toString());
                        boolean flag1 = false;
                        ListModel listmodel3 = MinWin.hostname.getModel();
                        String as3[] = new String[listmodel3.getSize() - 1];
                        for(int l1 = 0; l1 < listmodel3.getSize(); l1++)
                            if(!listmodel3.getElementAt(l1).toString().equals(s2))
                                as3[l1] = listmodel3.getElementAt(l1).toString();

                        MinWin.hostname.setListData(as3);
                        MinWin.hostname1.setListData(as3);
                    } else
                    {
                        s4 = "null";
                    }
                }
            }
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        return s4;
    }

    public String getagent(String s)
        throws RemoteException
    {
        String s1 = "";
        File file;
        if(s.equals("user"))
        {
            System.out.println("user level agent move..");
            int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
                as[i] = listmodel.getElementAt(i).toString();

            as[i] = "//User level Agent Activated";
            MinWin.status.setListData(as);
            file = new File("user.class");
        } else
        {
            System.out.println("packet level agent move..");
            file = new File("packet.class");
        }
        try
        {
            FileInputStream fileinputstream = new FileInputStream(file);
            boolean flag = false;
            int j;
            while((j = fileinputstream.read()) != -1) 
            {
                String s2 = String.valueOf((char)j);
                s1 = (new StringBuilder()).append(s1).append(s2).toString();
            }
        }
        catch(Exception exception) { }
        System.out.println("agent  end..");
        return s1;
    }

    public void addHost(String s)
        throws RemoteException
    {
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.hostname.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
                as[i] = listmodel.getElementAt(i).toString();

            as[i] = s;
            MinWin.hostname.setListData(as);
            MinWin.hostname1.setListData(as);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public String getipaddress()
        throws RemoteException
    {
        String s = "";
        try
        {
            InetAddress inetaddress = InetAddress.getLocalHost();
            s = inetaddress.getHostName();
        }
        catch(Exception exception) { }
        return s;
    }

    public Action LoadAction1()
    {
        System.out.println("in l1");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t1.stop();
                System.out.println("left l1");
                MyServerImpl.temp1 = Boolean.FALSE;
            }

            final MyServerImpl this$0;

            
            {
                this$0 = MyServerImpl.this;
                super(s);
            }
        }
;
    }

    public Action LoadAction2()
    {
        System.out.println("l2");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t2.stop();
                System.out.println("left l2");
                MyServerImpl.temp2 = Boolean.FALSE;
            }

            final MyServerImpl this$0;

            
            {
                this$0 = MyServerImpl.this;
                super(s);
            }
        }
;
    }

    public Action LoadAction3()
    {
        System.out.println("l3");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t3.stop();
                System.out.println("left l3");
                MyServerImpl.temp3 = Boolean.FALSE;
            }

            final MyServerImpl this$0;

            
            {
                this$0 = MyServerImpl.this;
                super(s);
            }
        }
;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
    }

    public String getConnect(String s, String s1)
        throws RemoteException
    {
        String s2 = "";
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.status.getModel();
            String as[] = new String[listmodel.getSize() + 2];
            for(i = 0; i < listmodel.getSize(); i++)
                as[i] = listmodel.getElementAt(i).toString();

            as[i++] = "User level Agent Activated";
            as[i] = "User level Agent Started";
            MinWin.status.setListData(as);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = DriverManager.getConnection("jdbc:odbc:networktraffic");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery((new StringBuilder()).append("select * from detail where username='").append(s).append("' and password='").append(s1).append("'").toString());
            if(resultset.next())
                s2 = (new StringBuilder()).append(s2).append(resultset.getString(3)).append(",").append(resultset.getString(4)).append(",").append(resultset.getString(5)).append(",").append(resultset.getString(6)).append(",").append(resultset.getString(7)).toString();
            else
                s2 = "null";
            System.out.println(s2);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        return s2;
    }

    public String getConnection(String s, String s1, String s2)
        throws RemoteException
    {
        System.out.println((new StringBuilder()).append("temp1 :=").append(temp1.toString()).toString());
        System.out.println((new StringBuilder()).append("temp2 :=").append(temp2.toString()).toString());
        System.out.println((new StringBuilder()).append("temp3 :=").append(temp3.toString()).toString());
        if(temp1 == Boolean.FALSE)
        {
            System.out.println("in temp1");
            temp1 = Boolean.TRUE;
            t1 = new Timer(19999, LoadAction1());
            t1.start();
            String s3 = getConnect(s, s1);
            return s3;
        }
        if(temp2 == Boolean.FALSE)
        {
            System.out.println("in temp2");
            temp2 = Boolean.TRUE;
            t2 = new Timer(19999, LoadAction2());
            t2.start();
            String s4 = getConnect(s, s1);
            return s4;
        }
        if(temp3 == Boolean.FALSE)
        {
            System.out.println("in temp3");
            temp3 = Boolean.TRUE;
            t3 = new Timer(19999, LoadAction3());
            t3.start();
            String s5 = getConnect(s, s1);
            return s5;
        }
        int i = 0;
        ListModel listmodel = MinWin.warning.getModel();
        String as[] = new String[listmodel.getSize() + 1];
        for(i = 0; i < listmodel.getSize(); i++)
            as[i] = listmodel.getElementAt(i).toString();

        as[i] = (new StringBuilder()).append(s2).append("//user level warning//Resource busy").toString();
        MinWin.warning.setListData(as);
        ListModel listmodel1 = MinWin.action.getModel();
        String as1[] = new String[listmodel1.getSize() + 1];
        for(i = 0; i < listmodel1.getSize(); i++)
            as1[i] = listmodel1.getElementAt(i).toString();

        as1[i] = (new StringBuilder()).append(s2).append("//Resource Request Denied").toString();
        MinWin.action.setListData(as1);
        ListModel listmodel2 = MinWin.message.getModel();
        String as2[] = new String[listmodel2.getSize() + 2];
        for(i = 0; i < listmodel2.getSize(); i++)
            as2[i] = listmodel2.getElementAt(i).toString();

        as2[i++] = (new StringBuilder()).append("Warning//").append(s2).append("//user level warning//Resource busy").append(" Intruder").toString();
        as2[i] = (new StringBuilder()).append("Action//").append(s2).append("//Resource Request Denied").toString();
        MinWin.message.setListData(as2);
        return "wait";
    }

    public void warningDisplay(String s, String s1)
        throws RemoteException
    {
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
                as[i] = listmodel.getElementAt(i).toString();

            as[i] = s1;
            MinWin.warning.setListData(as);
            ListModel listmodel1 = MinWin.action.getModel();
            String as1[] = new String[listmodel1.getSize() + 1];
            for(i = 0; i < listmodel1.getSize(); i++)
                as1[i] = listmodel1.getElementAt(i).toString();

            as1[i] = (new StringBuilder()).append(s).append("//killed Process").toString();
            MinWin.action.setListData(as1);
            ListModel listmodel2 = MinWin.message.getModel();
            String as2[] = new String[listmodel2.getSize() + 2];
            for(i = 0; i < listmodel2.getSize(); i++)
                as2[i] = listmodel2.getElementAt(i).toString();

            as2[i++] = (new StringBuilder()).append("Warning//").append(s1).append("Intruder").toString();
            as2[i] = (new StringBuilder()).append("Action//").append(s).append("//killed Process").toString();
            MinWin.message.setListData(as2);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void warningDisplay1(String s, String s1)
        throws RemoteException
    {
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
                as[i] = listmodel.getElementAt(i).toString();

            as[i] = (new StringBuilder()).append(s1).append("  Found").toString();
            MinWin.warning.setListData(as);
            ListModel listmodel1 = MinWin.action.getModel();
            String as1[] = new String[listmodel1.getSize() + 1];
            for(i = 0; i < listmodel1.getSize(); i++)
                as1[i] = listmodel1.getElementAt(i).toString();

            as1[i] = (new StringBuilder()).append(s).append("//Action Process").toString();
            MinWin.action.setListData(as1);
            ListModel listmodel2 = MinWin.message.getModel();
            String as2[] = new String[listmodel2.getSize() + 2];
            for(i = 0; i < listmodel2.getSize(); i++)
                as2[i] = listmodel2.getElementAt(i).toString();

            as2[i++] = (new StringBuilder()).append("Warning//").append(s1).append("//Intruder").toString();
            as2[i] = (new StringBuilder()).append("Response[Action]//").append(s).append("//Process").toString();
            MinWin.message.setListData(as2);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void delHost(String s)
        throws RemoteException
    {
        try
        {
            MinWin.filesel = "";
            boolean flag = false;
            ListModel listmodel = MinWin.hostname.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(int i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
                if(!as[i].equals(s))
                    continue;
                for(int j = i; j < listmodel.getSize(); j++)
                    as[j] = as[j + 1];

                as[listmodel.getSize() - 1] = "";
            }

            MinWin.hostname.setListData(as);
            MinWin.hostname1.setListData(as);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public String attackTypes(String s, String s1, String s2)
        throws RemoteException
    {
        String s3 = null;
        String s4 = (new StringBuilder()).append(s).append(":  ").append(s2).toString();
        JOptionPane.showConfirmDialog(mw1, s4, (new StringBuilder()).append("Type of Attack Found[ip]:").append(s1).toString(), -1, 0);
        if(s.equals("Trojan Horses"))
        {
            s3 = "SYSTEM FORMAT";
            warningDisplay1((new StringBuilder()).append("SYSTEM FORMAT:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Trojan Horses:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Port Scanning"))
        {
            s3 = "Filter Port or BlokPort";
            warningDisplay1((new StringBuilder()).append("Filter Port or BlokPort:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Port Scanning:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Sniffing"))
        {
            s3 = "Sniffing:BLOCK IP";
            warningDisplay1((new StringBuilder()).append("Sniffing:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Sniffing:BLOCK IP:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Denial of Services(DOS)"))
        {
            s3 = "BLOCK IP or or KILL";
            warningDisplay1((new StringBuilder()).append("BLOCK IP or or KILL:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Denial of Services(DOS):[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Buffer Overflow"))
        {
            s3 = "Buffer Overflow:ISOLATE ";
            warningDisplay1((new StringBuilder()).append("ISOLATE:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Buffer Overflow :[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Resource Exhaustion"))
        {
            s3 = "Resource Exhaustion:KILL";
            warningDisplay1((new StringBuilder()).append("KILL:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Resource Exhaustion:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Password Attacks"))
        {
            s3 = "Password Attacks:SHUTDOWN ";
            warningDisplay1((new StringBuilder()).append("SHUTDOWN:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Password Attacks:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Viruses"))
        {
            s3 = "Viruses:SCANNING";
            warningDisplay1((new StringBuilder()).append("SCANNING:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Viruses:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        if(s.equals("Worms"))
        {
            s3 = "Worms:SCANNING";
            warningDisplay1((new StringBuilder()).append("Worms:SCANNING:[ ").append(s1).append("]").toString(), (new StringBuilder()).append("Worms:[").append(s1).append(": ").append(s2).append(" ]").toString());
        } else
        {
            s3 = "hai";
        }
        System.out.println("test: called");
        MinWin.showDialog();
        return s3;
    }

    Timer t1;
    Timer t2;
    Timer t3;
    static Boolean temp1;
    static Boolean temp2;
    static Boolean temp3;
    static MinWin mw = null;
    String userpro;
    MinWin mw1;
    Hashtable pro;

    static 
    {
        temp1 = Boolean.FALSE;
        temp2 = Boolean.FALSE;
        temp3 = Boolean.FALSE;
    }
}
