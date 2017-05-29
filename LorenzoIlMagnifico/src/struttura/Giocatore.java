package struttura;

public class Giocatore extends Thread
{
	private String nome;
	private Plancia pl;
	private Familiare fbianco;
	private Familiare fnero;
	private Familiare farancione;
	private Familiare fneutro;
	private Scomunica sco;
	private boolean scomunicato;
	private Tabellone t;
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public Plancia getPl() 
	{
		return pl;
	}

	public void setPl(Plancia pl) 
	{
		this.pl = pl;
	}

	public Familiare getFbianco() 
	{
		return fbianco;
	}

	public void setFbianco(Familiare fbianco) 
	{
		this.fbianco = fbianco;
	}

	public Familiare getFnero() 
	{
		return fnero;
	}

	public void setFnero(Familiare fnero) 
	{
		this.fnero = fnero;
	}

	public Familiare getFarancione() {
		return farancione;
	}

	public void setFarancione(Familiare farancione) 
	{
		this.farancione = farancione;
	}

	public Familiare getFneutro() 
	{
		return fneutro;
	}

	public void setFneutro(Familiare fneutro) 
	{
		this.fneutro = fneutro;
	}

	public Scomunica getScomunica() 
	{
		return sco;
	}

	public void setScomunica(Scomunica sco) 
	{
		this.sco = sco;
	}

	public Giocatore()
	{}
	
	public Giocatore(String n)
	{
		nome = n;
		scomunicato=false;
		fbianco = new Familiare(0);
		fnero = new Familiare(1);
		farancione = new Familiare(2);
		fneutro = new Familiare(3);
	}
	
	public Tabellone PosizionaFamiliareRaccolto(Familiare f){
		if (t.spazioRaccoltoSingolo.isSpazioLibero()==true) {
			t.spazioRaccoltoSingolo.FamiliariPresenti[0]=f;
			t.spazioRaccoltoSingolo.valoreAzione=f.getForza();
			//attivare effetti permanenti delle carte territorio
			
		}
		
		else if (t.spazioRaccoltoSingolo.isSpazioLibero()==false) {
			int i=t.spazioRaccoltoMultiplo.FamiliariPresenti.length;
			
			if (f.getForza()-t.spazioRaccoltoMultiplo.malus >= t.spazioRaccoltoMultiplo.requisitoMinimo) {
				t.spazioRaccoltoMultiplo.FamiliariPresenti[i]=f;
				t.spazioRaccoltoMultiplo.valoreAzione=f.getForza();
				//attivare effetti permanenti delle carte territorio
			}
			
			else System.out.println("forza insufficiente");
		}
	return t;
	}
	
	public Tabellone PosizionaFamiliareProduzione(Familiare f){
		if (t.spazioProduzioneSingolo.isSpazioLibero()==true) {
			t.spazioProduzioneSingolo.FamiliariPresenti[0]=f;
			t.spazioProduzioneSingolo.valoreAzione=f.getForza();
			//attivare effetti permanenti delle carte edificio
			
			
		}
		
		else if (t.spazioProduzioneSingolo.isSpazioLibero()==false) {
			int i=t.spazioProduzioneMultiplo.FamiliariPresenti.length;
			
			if (f.getForza()-t.spazioProduzioneMultiplo.malus >= t.spazioProduzioneMultiplo.requisitoMinimo) {
				t.spazioProduzioneMultiplo.FamiliariPresenti[i]=f;
				t.spazioProduzioneMultiplo.valoreAzione=f.getForza();
				//attivare effetti permanenti delle carte edificio
			}
			
			else System.out.println("forza insufficiente");	
		}
		 
	return t;
	}
	
	
	public Familiare IncrementaForzaFamiliare(Familiare f) {
		
		if (pl.getServitori()>0) {
			pl.setServitori(pl.getServitori()-1);
			f.setForza(f.getForza()+1);
		}
		
		else System.out.println("servitori isufficienti");
		return f;
	}
	

	public Tabellone PosizionaFamiliareMercato(Familiare f) {
		
		if (f.getForza()>1) {	
			int i=0;
			while (i<4) {
				if (t.spaziomercato[i].isSpazioLibero()==false) {
					i++;
				}
				else {
					t.spaziomercato[i].FamiliariPresenti[0]=f;
					t.spaziomercato[i].OttieniRisorse(i);		
				}
			}	
		}
		else System.out.println("forza insufficiente");
			
		return t;
	}
	
	
	public void PosizionaFamiliarePiano() {
		
		
		
	}
	
	
}
