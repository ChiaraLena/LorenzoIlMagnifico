package network;

import struttura.Giocatore;

public abstract class GiocatoreRemoto extends Giocatore
{
	public abstract void InizioNuovoTurno(String username);
	
	public abstract void InizioUltimoTurno(String username);
	
	public abstract void TermineGioco();
}
