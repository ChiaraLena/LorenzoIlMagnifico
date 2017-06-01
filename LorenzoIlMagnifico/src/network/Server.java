package network;

import java.util.HashMap;

import network.server.rmi.RMIServer;
import network.server.socket.SocketServer;

public class Server implements InterfacciaServer
{
	private static final int PORTA_SOCKET = 3000;
	private static final int PORTA_RMI = 4000;
	
	private static final Object MUTEX_GIOCATORI = new Object();
	
	private HashMap<String, GiocatoreRemoto> mieiGioc;
	
	private SocketServer mioSS;
	private RMIServer mioRMIS;
	
	public Server()
	{
		mioSS = new SocketServer(PORTA_SOCKET);
		mioRMIS = new RMIServer(PORTA_RMI, this);
	}
	
	public void StartServer()
	{
		mieiGioc = new HashMap<>();
		
		mioSS.startServer();
		mioRMIS.StartServer();
	}

	public void Login(String username, GiocatoreRemoto gioc) 
	{
		synchronized (MUTEX_GIOCATORI)
		{
			if (!mieiGioc.containsKey(username))
			{
				mieiGioc.put(username, gioc);
				gioc.setNome(username);
			}
		}
	}

	public GiocatoreRemoto getPlayer(String username) 
	{
		return mieiGioc.get(username);
	}
}