package network;

import java.rmi.RemoteException;

public abstract class ClientAstratto 
{
	private final InterfacciaClient mioClient;
	private final String mioIndirizzo;
	private final int miaPorta;
	
	public String getIndirizzo()
	{
		return mioIndirizzo;
	}
	
	public int getPorta()
	{
		return miaPorta;
	}
	
	public InterfacciaClient getClient()
	{
		return mioClient;
	}
	
	public ClientAstratto(InterfacciaClient c, String i, int p)
	{
		mioClient = c;
		mioIndirizzo = i;
		miaPorta = p;
	}
	
	public abstract void Connetti() throws RemoteException, Exception;
	
	public abstract void Login(String username) throws RemoteException;
	
	public abstract void FineTurno();
}
