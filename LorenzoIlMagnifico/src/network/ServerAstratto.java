package network;

public abstract class ServerAstratto 
{
	private final InterfacciaServer mioServer;

	public InterfacciaServer getMioServer() 
	{
		return mioServer;
	}
	
	public ServerAstratto(InterfacciaServer is)
	{
		mioServer = is;
	}
	
	public abstract void StartServer();
}
