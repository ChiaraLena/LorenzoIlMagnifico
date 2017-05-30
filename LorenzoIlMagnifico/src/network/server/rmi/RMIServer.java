package network.server.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

<<<<<<< HEAD
import network.client.rmi.RMIGiocatoreInterfaccia;

public class RMIServer implements RMIServerInterfaccia
{
	private int porta;
	
	public int getPorta()
	{
		return porta;
	}
	
	public RMIServer(int portaRmi) 
	{
		porta = portaRmi;
	}

	public void StartServer()
	{
		Registry registro = createOrLoadRegistry(porta);
		try
		{
			registro.rebind("RMIServerInterfaccia", this);
			UnicastRemoteObject.exportObject(this, porta);
		}
		catch (RemoteException e)
		{
			
		}
	}
		
	private Registry createOrLoadRegistry(int porta) 
	{
		try
		{
			return LocateRegistry.createRegistry(porta);
		}
		catch (RemoteException e)
		{
			System.err.println("Il registro esiste già!");
			System.err.println(e);
		}
		try
		{
			return LocateRegistry.getRegistry(porta);
		}
		catch (RemoteException e)
		{
			System.err.println("Non ho trovato il registro...");
			System.err.println(e);
		}
		System.err.println("Non è possibile inizializzare il registro.");
		return null;
	}

	@Override
	public String Login(String username, RMIGiocatoreInterfaccia gioc) 
=======
public class RMIServer implements RMIServerInterfaccia
{
	private int porta;
	
	public int getPorta()
	{
		return porta;
	}
	
	public RMIServer(int portaRmi) 
	{
		porta = portaRmi;
	}

	public void StartServer()
	{
		Registry registro = createOrLoadRegistry(porta);
		try
		{
			registro.rebind("RMIServerInterfaccia", this);
			UnicastRemoteObject.exportObject(this, porta);
		}
		catch (RemoteException e)
		{
			
		}
	}
		
	private Registry createOrLoadRegistry(int porta) 
	{
		try
		{
			return LocateRegistry.createRegistry(porta);
		}
		catch (RemoteException e)
		{
			System.err.println("Il registro esiste già!");
			System.err.println(e);
		}
		try
		{
			return LocateRegistry.getRegistry(porta);
		}
		catch (RemoteException e)
		{
			System.err.println("Non ho trovato il registro...");
			System.err.println(e);
		}
		System.err.println("Non è possibile inizializzare il registro.");
		return null;
	}

	@Override
	public String Login(String username) 
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
	{
		return null;
	}

}
