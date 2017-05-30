package network.client.rmi;

import java.rmi.Remote;

public interface RMIGiocatoreInterfaccia extends Remote
{
	void NotificaNuovoTurno(String username);
	
	void NotificaUltimoTurno(String username);
	
	void NotificaGiocoTerminato();
}
