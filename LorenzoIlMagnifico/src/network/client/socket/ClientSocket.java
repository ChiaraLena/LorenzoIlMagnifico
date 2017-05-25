package network.client.socket;

import java.io.*;
import java.net.Socket;
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
	}
}
