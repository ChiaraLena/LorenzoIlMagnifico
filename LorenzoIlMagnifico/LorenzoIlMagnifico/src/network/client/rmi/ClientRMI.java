package network.client.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import network.ClientAstratto;
import network.InterfacciaClient;
import network.server.rmi.RMIServerInterfaccia;

public class ClientRMI extends ClientAstratto implements RMIGiocatoreInterfaccia
{
	private int porta;
	private RMIServerInterfaccia mioServer;
	private String nomeRMI;
	
	public int getPorta()
	{
		return porta;
	}
	
	public String getNomeRMI()
	{
		return nomeRMI;
	}
	
	public ClientRMI(InterfacciaClient mc, String ind, int p)
	{
		super(mc, ind, p);
	}
	
	public void Connetti() throws RemoteException, Exception
	{
		try
		{
			Registry registro = LocateRegistry.getRegistry("loalhost", porta);
			mioServer = (RMIServerInterfaccia) registro.lookup("RMIServerInterfaccia");
			UnicastRemoteObject.exportObject(this, 0);
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	public void Login(String username) throws RemoteException
	{
		try
		{
			nomeRMI = mioServer.Login(username, this);
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	@Override
	public void NotificaNuovoTurno(String username) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NotificaUltimoTurno(String username) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NotificaGiocoTerminato() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FineTurno() {
		// TODO Auto-generated method stub
		
	}
}
