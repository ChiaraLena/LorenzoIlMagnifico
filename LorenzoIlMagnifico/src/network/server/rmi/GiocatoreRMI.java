package network.server.rmi;

import network.GiocatoreRemoto;
import network.client.rmi.RMIGiocatoreInterfaccia;
import struttura.Turno;

public class GiocatoreRMI extends GiocatoreRemoto
{
	private RMIGiocatoreInterfaccia miaInterfaccia;
	
	private Turno mioTurno;
	
	public GiocatoreRMI(RMIGiocatoreInterfaccia interfaccia)
	{
		miaInterfaccia = interfaccia;
	}

	@Override
	public void InizioNuovoTurno(String username) 
	{
		miaInterfaccia.NotificaNuovoTurno(username);
	}

	@Override
	public void InizioUltimoTurno(String username) 
	{
		miaInterfaccia.NotificaUltimoTurno(username);
	}

	@Override
	public void TermineGioco() 
	{
		miaInterfaccia.NotificaGiocoTerminato();
	}

	@Override
	public void FineTurno() 
	{
		// TODO Auto-generated method stub
		
	}
}
