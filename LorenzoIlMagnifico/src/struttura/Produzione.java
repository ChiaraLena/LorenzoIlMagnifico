package struttura;

public class Produzione extends SpazioAzione {
	
	private boolean spazioLibero;
	Plancia pl;
	
	public boolean isSpazioLibero() 
	{
		return spazioLibero;
	}

	public void setSpazioLibero(boolean spazioLibero) 
	{
		this.spazioLibero = spazioLibero;
	}
	
	public Produzione() {
		
		spazioLibero=true;
		pl=new Plancia();
		this.nomeAzione="Produzione";
		
	}

}
