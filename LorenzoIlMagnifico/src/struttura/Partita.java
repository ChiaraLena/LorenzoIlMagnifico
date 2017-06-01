package struttura;

import java.util.ArrayList;
import java.util.concurrent.*;

import network.GiocatoreRemoto;

public class Partita
{
	private static final int NUMERO_MINIMO_GIOC = 2;
	private static final int MAX_GIOC = 4;
	
	private static final Object MUTEX_PARTITA = new Object();
	
	private final ArrayList<GiocatoreRemoto> mieiGioc;
	private boolean possoEntrare;
	
	private Turno mioTurno;
	private Tabellone mioTab;
	
	public Partita(GiocatoreRemoto gioc)
	{
		mieiGioc = new ArrayList<>();
		mieiGioc.add(gioc);
		possoEntrare = true;
	}
	
	public void EntraPartita(GiocatoreRemoto gioc)
	{
		synchronized (MUTEX_PARTITA)
		{
			if(possoEntrare)
			{
				mieiGioc.add(gioc);
				if(mieiGioc.size()==MAX_GIOC)
				{
					possoEntrare = false;
					IniziaPartita();
				}
			}
		}
	}
	
	private void IniziaPartita()
	{
		
	}
	
	private class AvviaPartita implements Runnable
	{
		public void run() 
		{
			for (GiocatoreRemoto gioc : mieiGioc)
			{
				try
				{
					gioc.InizioNuovoGioco(mioTab);
				}
				catch (Exception e)
				{
					System.err.println(e);
				}
			}
		}
	}
}
