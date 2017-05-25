package struttura;

public class Ordine extends Turno
{
	public String[] ordine = new String[4];
	
	public Ordine()
	{
		ordine = null;
	}
	
	public void Inserisci(String n)
	{
		for (int i=0; i<ordine.length; i++)
		{
			if (ordine[i].equals(n))
				return;
			else if (ordine[i] == null)
				ordine[i] = n;
		}
	}
}
