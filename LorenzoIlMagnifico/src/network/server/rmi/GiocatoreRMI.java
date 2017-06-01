package network.server.rmi;

import network.GiocatoreRemoto;
import network.client.rmi.RMIGiocatoreInterfaccia;

public class GiocatoreRMI extends GiocatoreRemoto
{
	private RMIGiocatoreInterfaccia miaInterfaccia;
	
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
}
