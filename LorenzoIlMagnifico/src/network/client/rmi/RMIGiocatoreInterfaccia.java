package network.client.rmi;

import java.rmi.Remote;

import struttura.Tabellone;

public interface RMIGiocatoreInterfaccia extends Remote
{
	void InizioNuovoGioco(Tabellone tab);
	
	void NotificaNuovoTurno(String username);
	
	void NotificaUltimoTurno(String username);
	
	void NotificaGiocoTerminato();
}
