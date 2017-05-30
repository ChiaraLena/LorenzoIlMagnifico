package struttura;

public class CartaPersonaggio extends Carta
{
	private int costomoneta;
	Plancia pl;
	
	public CartaPersonaggio()
	{
		setColore(ColoriCarteTorri.azzurro);
	}
	
	public CartaPersonaggio (String n, int p, int costo)
	{
		setColore(ColoriCarteTorri.azzurro);
		setNome(n);
		setPeriodo(p);
		costomoneta = costo;
	}

	@Override
	public Plancia EffettoImmediato() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}
	@Override
	public Plancia EffettoPermanente() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}
}
