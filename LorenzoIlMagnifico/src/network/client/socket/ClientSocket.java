package network.client.socket;

import java.io.*;
import java.net.Socket;
<<<<<<< HEAD
import java.rmi.RemoteException;
import java.util.Scanner;

import network.ClientAstratto;
import network.InterfacciaClient;

public class ClientSocket extends ClientAstratto
{
	//private String indirizzo;
	//private int porta;
	
	//private String username;
	
	private Socket soc;
	private Scanner in;	
	private Scanner stin;
	private PrintWriter out;
	private PrintWriter outV;
	
	public ClientSocket(InterfacciaClient mc, String ind, int p)
	{
		super(mc, ind, p);
	}

	public void Connetti() throws RemoteException, Exception 
	{
		try
		{
			soc = new Socket(this.getIndirizzo(), this.getPorta());
			
			in = new Scanner(soc.getInputStream());
			out = new PrintWriter(soc.getOutputStream());
			
			stin = new Scanner(System.in);
			outV = new PrintWriter(System.out);
		}
		catch(IOException e)
		{
			
		}
	}

	public void Login(String username) throws RemoteException 
	{
		boolean loggato = false;
		try
		{
			while (!loggato)
			{
				outV.println("Inserire nome:");
				username = in.nextLine();
				
				out.println("login");
				out.flush();
				out.println(username);
				out.flush();
				
				loggato = Boolean.valueOf(in.nextLine()).booleanValue();
				
				if(loggato)
					outV.println("login effettuato con successo");
				else
					outV.println("ritenta, sarai più fortunato");
			}
		}
		catch(Exception e)
		{}
	}

	@Override
	public void FineTurno() {
		// TODO Auto-generated method stub
		
=======
import java.util.Scanner;

public class ClientSocket
{
	private String indirizzo;
	private int porta;
	
	private String username;
	
	Socket soc;
	Scanner in;	
	Scanner stin;
	PrintWriter out;
	PrintWriter outV;
	
	public ClientSocket(String ip, int port)
	{
		indirizzo = ip;
		porta = port;
		
		username="";
	}
	
	public void StartClient() throws IOException
	{
		soc = new Socket(indirizzo, porta);
		
		in = new Scanner(soc.getInputStream());
		out = new PrintWriter(soc.getOutputStream());
		
		stin = new Scanner(System.in);
		outV = new PrintWriter(System.out);
		
		try
		{
			while (true)
			{
				if (stin.equals("fine"))
					break;
				else
				{
					out.println(stin);
					out.flush();
				}
			}
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			in.close();
			out.close();
			stin.close();
			outV.close();
			soc.close();
		}
	}
	
	public void Login()
	{
		boolean loggato = false;
		try
		{
			while (!loggato)
			{
				outV.println("Inserire nome:");
				username = in.nextLine();
				
				out.println("login");
				out.flush();
				out.println(username);
				out.flush();
				
				loggato = Boolean.valueOf(in.nextLine()).booleanValue();
				
				if(loggato)
					outV.println("login effettuato con successo");
				else
					outV.println("ritenta, sarai più fortunato");
			}
		}
		catch(Exception e)
		{}
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
	}
}
