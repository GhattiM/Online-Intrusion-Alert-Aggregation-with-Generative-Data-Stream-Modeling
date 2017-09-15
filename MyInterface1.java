import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface1 extends Remote
{
	public void alpha() throws RemoteException;
}


