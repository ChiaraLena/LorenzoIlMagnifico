package struttura;

public class Mercato extends SpazioAzione
{

	
	private boolean spazioLibero;
	Plancia p;
	
	public boolean isSpazioLibero() 
	{
		return spazioLibero;
	}

	public void setSpazioLibero(boolean spazioLibero) 
	{
		this.spazioLibero = spazioLibero;
	}
	
	public Mercato() 
	{
		spazioLibero = true;	
		p = new Plancia();
		this.nomeAzione="Mercato";
		this.requisitoMinimo=1;
		this.malus=0;
		this.numMaxFamiliari=1;
		
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
