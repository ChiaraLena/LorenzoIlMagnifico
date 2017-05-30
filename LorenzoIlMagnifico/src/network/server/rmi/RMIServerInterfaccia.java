package network.server.rmi;

import java.rmi.Remote;

<<<<<<< HEAD
import network.client.rmi.RMIGiocatoreInterfaccia;

public interface RMIServerInterfaccia extends Remote
{
	String Login(String username, RMIGiocatoreInterfaccia gioc);
=======
public interface RMIServerInterfaccia extends Remote
{
	String Login(String username);
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
}
