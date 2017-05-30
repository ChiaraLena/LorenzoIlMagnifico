package network.server.socket;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import network.GestoreClient;

public class SocketServer
{
	private int porta;
	
	public int getPorta()
	{
		return this.porta;
	}

	public SocketServer(int p)
	{
		porta = p;
	}
	
	public void startServer()
	{
		ExecutorService esecutore = Executors.newCachedThreadPool();
		ServerSocket ss;
		try
		{
			ss = new ServerSocket(porta);
		}
		catch(Exception e)
		{
			return;
		}
		
		//A questo punto, il server è pronto a ricevere
		while (true)
		{
			try
			{
				Socket cs = ss.accept();
				esecutore.submit(new GestoreClient(cs));
			}
			catch(Exception e)
			{
				break;
			}
			
			esecutore.shutdown();
			
			try
			{
				ss.close();
			}
			catch(Exception e)
			{
				return;
			}
		}
	}
}
