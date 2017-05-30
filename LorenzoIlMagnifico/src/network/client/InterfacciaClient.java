package network.client;

import struttura.Tabellone;;

public interface InterfacciaClient 
{
	public void InizioGioco(Tabellone t);
	public void InizioTurno(String nomeGiocatore);
	
	//vanno aggiunti tutti i metodi che ogni client può eseguire
}
