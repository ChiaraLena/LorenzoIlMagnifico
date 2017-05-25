package struttura;

public class Turno extends Partita
{
	public Dado nero;
	public Dado arancione;
	public Dado bianco;
	public Ordine ord;
	public Tabellone tab;
	public int cont;
	public int periodo;
	
	public Turno()
	{
		nero = new Dado(0);
		arancione = new Dado(1);
		bianco = new Dado(2);
		cont = 1;
		periodo = 1;
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
}
