package network.server.rmi;

import java.rmi.Remote;

import network.client.rmi.RMIGiocatoreInterfaccia;

public interface RMIServerInterfaccia extends Remote
{
	String Login(String username, RMIGiocatoreInterfaccia gioc);
}
