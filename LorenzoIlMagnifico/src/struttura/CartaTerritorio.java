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

	@Override
	public Plancia EffettoImmediato() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}

	public Plancia EffettoPermanente() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}

}
