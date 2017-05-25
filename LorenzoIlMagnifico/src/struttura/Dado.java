package struttura;

public class Dado extends Turno
{
	private int valore;
	private ColoriDado colore;
	
	public int getValore() 
	{
		return valore;
	}

	public void setValore(int valore) 
	{
		this.valore = valore;
	}

	public ColoriDado getColore() 
	{
		return colore;
	}

	public void setColore(ColoriDado colore) 
	{
		this.colore = colore;
	}

	public Dado(int n)
	{
		valore = (int)((int) 6*Math.random());
		if (n==0)
			colore=ColoriDado.nero;
		else if (n==1)
			colore=ColoriDado.arancione;
		else if (n==2)
			colore=ColoriDado.bianco;
	}
	
	public int NuovoValore()
	{
		return valore = (int)((int) 6*Math.random());
	}
}
