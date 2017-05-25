package network;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GestoreClient implements Runnable
{
	private Socket so;
	
	public GestoreClient(Socket cs) 
	{
		so = cs;
	}

	public void run() 
	{
		try
		{
			Scanner in = new Scanner(so.getInputStream());
			PrintWriter out = new PrintWriter(so.getOutputStream());
			
			while(true)
			{
				String messaggioClient = in.nextLine();
				if (messaggioClient.equals("fine"))
				{
					break;
				}
				else 
				{
					out.println("Il messaggio ricevuto è: " + messaggioClient);
					out.flush();
				}
			}
			
			in.close();
			out.close();
			so.close();
		}
		catch (Exception e)
		{}
	}

}
