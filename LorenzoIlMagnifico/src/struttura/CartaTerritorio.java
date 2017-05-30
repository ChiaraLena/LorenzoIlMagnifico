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

<<<<<<< HEAD
	public Plancia EffettoImmediato() 
	{
		pl = new Plancia();
		return pl;
	}

	public Plancia EffettoPermanente() 
	{
		pl = new Plancia();
=======
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
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
		return pl;
	}

}
