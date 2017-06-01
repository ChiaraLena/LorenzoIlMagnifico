package network;

import struttura.Giocatore;
import struttura.Tabellone;

public abstract class GiocatoreRemoto extends Giocatore
{
	public abstract void InizioNuovoGioco(Tabellone tab);
	
	public abstract void InizioNuovoTurno(String username);
	
	public abstract void InizioUltimoTurno(String username);
	
	public abstract void FineTurno();
	
	public abstract void TermineGioco();
}
