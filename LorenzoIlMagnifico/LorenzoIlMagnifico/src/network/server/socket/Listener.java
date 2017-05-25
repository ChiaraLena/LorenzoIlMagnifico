package network.server.socket;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;

import struttura.Giocatore;

public class Listener extends Thread
{
	private HashMap<String, Giocatore> utenti;
	private Giocatore giocCor;
	private Listener connessi[];
	private Socket client;
	/*se stato=0 -> login
	 *se stato=1 ->
	 * */
	private int stato;
	
	public Listener(Socket cl, HashMap<String, Giocatore> u, Listener conListeners[])
	{
		client = cl;
		utenti = u;
		connessi = conListeners;
		stato=-1;
	}
	
	public synchronized Giocatore InserisciGiocatore(String username)
	{
		giocCor = null;
		if (utenti.containsKey(username))
		{
			return giocCor;
		}
		else 
		{
			giocCor = new Giocatore();
			giocCor.setNome(username);
			utenti.put(username,  giocCor);
		}
		return giocCor;
	}
	
	public void run()
	{
		DataInputStream dati = null;
		PrintStream uscita = null;
		try
		{
			dati = new DataInputStream(client.getInputStream());
			uscita = new PrintStream(client.getOutputStream());
			
			while (true)
			{
				
			}
		}
		catch (Exception e)
		{}
	}
}
