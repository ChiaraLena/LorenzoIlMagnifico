package struttura;

import network.GiocatoreRemoto;

public class Turno
{
	public Dado nero;
	public Dado arancione;
	public Dado bianco;
	public Ordine ord;
	public Tabellone tab;
	public int cont;
	public int periodo;
	
	private GiocatoreRemoto gioc;
	private static final Object MUTEX_TURNO = new Object();
	
	public Turno()
	{
		nero = new Dado(0);
		arancione = new Dado(1);
		bianco = new Dado(2);
		cont = 1;
		periodo = 1;
	}
	
	public GiocatoreRemoto setGiocatoreRemoto(GiocatoreRemoto username)
	{
		return gioc = username;
	}
	
	public void Resetta()
	{
		nero.NuovoValore();
		arancione.NuovoValore();
		bianco.NuovoValore();
		cont++;
		if (cont%2 != 0)
			periodo++;
		ord = tab.spazioconsiglio.NuovoOrdine();
		tab.Pulisci();
	}
	
	public boolean GiocatoreCorrente(GiocatoreRemoto username)
	{
		if (gioc==username)
			return true;
		return false;
	}
	
	/*public void FineTurno()
	{
		synchronized(MUTEX_TURNO)
		{
			gioc.FineTurno();
		}
	}*/
}
