package struttura;

import java.util.ArrayList;

public class PalazzoConsiglio extends SpazioAzione
{
	Plancia pl;
	Ordine ordine;
	ArrayList<Familiare> familiariPresenti;
	
	
	public PalazzoConsiglio() 
	{
		ordine=new Ordine();
		familiariPresenti= new ArrayList<Familiare>();
		pl = new Plancia();
		this.nomeAzione="PalazzoConsiglio";
		this.malus=0;
		this.requisitoMinimo=1;
	}
	
	public Plancia OttieniRisorse() 
	{
		pl.setMonete(pl.getMonete() + 1);
		pl.setPrivilegio(pl.getPrivilegio() + 1);
		return pl;
	}

	public Ordine NuovoOrdine() 
	{
		for (int i=0; i<familiariPresenti.size(); i++)
		{
			ordine.Inserisci(familiariPresenti.get(i).getNome());
		}
		return ordine;	
	}
}
