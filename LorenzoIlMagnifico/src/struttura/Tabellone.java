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
	
<<<<<<< HEAD
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
=======
	Raccolto spazioRaccoltoSingolo;
	Raccolto spazioRaccoltoMultiplo;
	
	Produzione spazioProduzioneSingolo;
	Produzione spazioProduzioneMultiplo;
	
	public Tabellone()
	{
		//creo le 4 torri, la differenza sta nel colore
		torreterritorio = new Torre(0);
		torrepersonaggio= new Torre(1);
		torreedificio = new Torre(2);
		torreimpresa = new Torre(3);
		
		//creo tutti gli elementi rimanenti
		spaziochiesa = new SpazioChiesa();
		spaziomercato = new Mercato[4];
		spazioconsiglio = new PalazzoConsiglio();
		spazioRaccoltoSingolo = new Raccolto();
		spazioProduzioneSingolo=new Produzione();
		spazioRaccoltoSingolo.numMaxFamiliari=1;
		spazioRaccoltoSingolo.requisitoMinimo=1;
		spazioProduzioneSingolo.numMaxFamiliari=1;
		spazioProduzioneSingolo.requisitoMinimo=1;
		
		
		
		//creo gli spaziproduzionemultipli solo se ci sono 3 o 4 giocatori
		spazioRaccoltoMultiplo=new Raccolto();
		spazioRaccoltoMultiplo.malus=3;
		spazioProduzioneMultiplo=new Produzione();
		spazioProduzioneMultiplo.malus=3;
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
	}
	
	public void Pulisci()
	{}
}
