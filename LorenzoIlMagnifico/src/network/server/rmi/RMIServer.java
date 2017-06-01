package network.server.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.UUID;

import network.GiocatoreRemoto;
import network.InterfacciaServer;
import network.ServerAstratto;
import network.client.rmi.RMIGiocatoreInterfaccia;

public class RMIServer extends ServerAstratto implements RMIServerInterfaccia
{
	private int porta;
	private final HashMap<String, String> mieiGiocatori;
	
	public int getPorta()
	{
		return porta;
	}
	
	public RMIServer(int portaRmi, InterfacciaServer mioServer) 
	{
		super(mioServer);
		porta = portaRmi;
		mieiGiocatori = new HashMap<>();
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
	
	public GiocatoreRemoto getGiocatore(String username)
	{
		return this.getMioServer().getPlayer(mieiGiocatori.get(username));
	}
	
	@Override
	public String Login(String username, RMIGiocatoreInterfaccia gioc) 
	{
		this.getMioServer().Login(username, new GiocatoreRMI(gioc));
		String id = UUID.randomUUID().toString();
		mieiGiocatori.put(id, username);
		return id;
	}

	@Override
	public void FineTurno(String username) 
	{
		GiocatoreRemoto gr = this.getGiocatore(username);
		gr.FineTurno();
	}

}
