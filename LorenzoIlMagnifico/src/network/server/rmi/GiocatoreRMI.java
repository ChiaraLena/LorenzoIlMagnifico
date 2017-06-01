package network.server.rmi;

import network.GiocatoreRemoto;
import network.client.rmi.RMIGiocatoreInterfaccia;
import struttura.Tabellone;
import struttura.Turno;

public class GiocatoreRMI extends GiocatoreRemoto
{
	private RMIGiocatoreInterfaccia miaInterfaccia;
	
	private Turno mioTurno;
	
	public GiocatoreRMI(RMIGiocatoreInterfaccia interfaccia)
	{
		miaInterfaccia = interfaccia;
	}

	public void InizioNuovoGioco(Tabellone tab) 
	{
		miaInterfaccia.InizioNuovoGioco(tab);
	}

	public void InizioNuovoTurno(String username) 
	{
		miaInterfaccia.NotificaNuovoTurno(username);
	}

	public void InizioUltimoTurno(String username) 
	{
		miaInterfaccia.NotificaUltimoTurno(username);
	}

	public void TermineGioco() 
	{
		miaInterfaccia.NotificaGiocoTerminato();
	}

	public void FineTurno() 
	{
		
	}
}
