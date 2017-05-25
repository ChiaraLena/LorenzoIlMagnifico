package struttura;

public class CartaEdificio extends Carta
{
	private int costomoneta;
	private int costolegno;
	private int costopietra;
	private int costoservitore;
	Plancia pl;
	
	public CartaEdificio()
	{
		setColore(ColoriCarteTorri.giallo);
	}
	
	public CartaEdificio (String n, int p, int cm, int cl, int cp, int cs)
	{
		setColore(ColoriCarteTorri.giallo);
		setNome(n);
		setPeriodo(p);
		costomoneta = cm;
		costolegno = cl;
		costopietra = cp;
		costoservitore = cs;
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
