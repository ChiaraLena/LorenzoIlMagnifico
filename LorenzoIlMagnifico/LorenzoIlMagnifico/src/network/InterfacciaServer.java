package network;

public interface InterfacciaServer 
{
	void Login(String username, GiocatoreRemoto gioc);
	
	GiocatoreRemoto getPlayer(String username);
}
