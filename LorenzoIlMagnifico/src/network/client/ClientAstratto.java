package network.client;

public abstract class ClientAstratto 
{
	private final InterfacciaClient controllerClient;
	private final String indirizzo;
	private final int porta;
	
	public InterfacciaClient getControllerClient() 
	{
		return controllerClient;
	}
	
	public String getIndirizzo() 
	{
		return indirizzo;
	}
	
	public int getPorta() 
	{
		return porta;
	}
	
	public ClientAstratto(InterfacciaClient cont, String ind, int por)
	{
		controllerClient = cont;
		indirizzo = ind;
		porta = por;
	}
	
	public abstract void Connetti();
	public void InizializzaConnessione() {}
	public abstract void Login();
}
