package struttura;

public class CartaTerritorio extends Carta
{
	Plancia pl;
	
	public CartaTerritorio()
	{
		setColore(ColoriCarteTorri.verde);
	}
	
	public CartaTerritorio(String n, int p)
	{
		setColore(ColoriCarteTorri.verde);
		setNome(n);
		setPeriodo(p);
	}


	public Plancia EffettoImmediato() 
	{
		pl = new Plancia();
		return pl;
	}

	public Plancia EffettoPermanente() 
	{
		pl = new Plancia();
		return pl;
	}

}
