package struttura;

public class Raccolto extends SpazioAzione {
	
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
	
	public Raccolto() {
		
		spazioLibero=true;
		pl=new Plancia();
		this.nomeAzione="Raccolto";
		
	}

}
