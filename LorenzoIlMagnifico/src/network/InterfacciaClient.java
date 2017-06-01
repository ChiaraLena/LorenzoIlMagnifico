package network;

import struttura.Tabellone;

public interface InterfacciaClient 
{
	void InizioGioco(Tabellone tab);
	
	void InizioNuovoTurno(String username);
	
	void InizioUltimoTurno(String username);
	
	void FineGioco();
}
