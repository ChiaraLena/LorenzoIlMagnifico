package network;

import network.server.rmi.RMIServer;
import network.server.socket.SocketServer;

public class Server 
{
	private static final int PORTA_SOCKET = 3000;
	private static final int PORTA_RMI = 4000;
	
	
	
	private SocketServer mioSS;
	private RMIServer mioRMIS;
	
	public Server()
	{
		mioSS = new SocketServer(PORTA_SOCKET);
		mioRMIS = new RMIServer(PORTA_RMI);
	}
	
	public void StartServer()
	{
		mioSS.startServer();
		mioRMIS.StartServer();
	}
	
	public void LoginPlayer(String username)
	{
		
	}
}
