package struttura;

public class Tabellone extends Turno
{
	public Torre torreterritorio;
	public Torre torreedificio;
	public Torre torrepersonaggio;
	public Torre torreimpresa;
	public SpazioChiesa spaziochiesa;
	public Mercato[] spaziomercato;
	public PalazzoConsiglio spazioconsiglio;
	
	public Tabellone()
	{
		//creo le 4 torri, la differenza sta nel colore
		torreterritorio = new Torre(0);
		torreedificio = new Torre(2);
		torrepersonaggio= new Torre(1);
		torreimpresa = new Torre(3);
		//creo tutti gli elementi rimanenti
		spaziochiesa = new SpazioChiesa();
		spaziomercato = new Mercato[4];
		spazioconsiglio = new PalazzoConsiglio();
	}
	
	public void Pulisci()
	{}
}
