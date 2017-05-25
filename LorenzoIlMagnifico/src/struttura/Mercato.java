package struttura;

public class Mercato extends Tabellone
{
	private boolean spaziolibero;
	Plancia p;
	
	public boolean isSpaziolibero() 
	{
		return spaziolibero;
	}

	public void setSpaziolibero(boolean spaziolibero) 
	{
		this.spaziolibero = spaziolibero;
	}
	
	public Mercato() 
	{
		spaziolibero = true;	
		p = new Plancia();
	}

	public Plancia OttieniRisorse(int i) 
	{
		switch(i) 
		{
			case 0:
				p.setMonete(p.getMonete() + 5);
				break;
		
			case 1:
				p.setServitori(p.getServitori() + 5);
				break;
				
			case 2:
				p.setMonete(p.getMonete() + 2);
				p.setPuntimil(p.getPuntimil() + 3);
				break;
			
			case 3:
				p.setPrivilegio(p.getPrivilegio() + 2);
				break;
		}
		return p;
	}
}
