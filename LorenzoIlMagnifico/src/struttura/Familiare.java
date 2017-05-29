package struttura;

public class Familiare extends Giocatore
{	
	private ColoriDado colore;
	private int forza;
	
	public ColoriDado getColore() {
		return colore;
	}

	public void setColore(ColoriDado colore) {
		this.colore = colore;
	}

	public int getForza() {
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	public Familiare(int i)
	{
		switch(i)
		{
			case 0:
				colore=ColoriDado.bianco;
				forza=1;
				break;
			
			case 1:
				colore=ColoriDado.nero;
				forza=1;
				break;
			
			case 2:
				colore=ColoriDado.arancione;
				forza=1;
				break;
			
			case 3:
				colore=ColoriDado.neutro;
				forza=0;
				break;
		}
	}
	
	public void CambiaForza(Dado d)
	{
		if (d.getColore()==this.colore)
		{
			this.forza = d.getValore();
		}
	}
	
	public void Posiziona(Tabellone t)
	{
		
	}
}
