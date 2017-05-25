package network.server.rmi;

import java.rmi.Remote;

public interface RMIServerInterfaccia extends Remote
{
	String Login(String username);
}
