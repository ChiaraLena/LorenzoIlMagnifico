package struttura;

import java.util.ArrayList;

public class PalazzoConsiglio extends Tabellone
{
	Plancia pl;
	Ordine ordine;
	ArrayList<Familiare> familiariPresenti;
	
	
	public PalazzoConsiglio() 
	{
		ordine=new Ordine();
		familiariPresenti= new ArrayList<Familiare>();
		pl = new Plancia();
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
	
	public void InserisciFamiliare(Familiare f) 
	{
		if (f.getForza()>=1) 
		{
			familiariPresenti.add(f);
		}
	}
}
