package struttura;

public class CartaImpresa extends Carta
{
	private int costomoneta;
	private int costolegno;
	private int costopietra;
	private int costoservitore;
	private int costopuntomilitare;
	Plancia pl;
	
	public CartaImpresa()
	{
		setColore(ColoriCarteTorri.viola);
	}
	
	public CartaImpresa (String n, int p, int cm, int cl, int cp, int cs, int cpm)
	{
		setColore(ColoriCarteTorri.viola);
		setNome(n);
		setPeriodo(p);
		costomoneta = cm;
		costolegno = cl;
		costopietra = cp;
		costoservitore = cs;
		costopuntomilitare = cpm;
	}
	
	@Override
	public Plancia EffettoImmediato() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}

	
}
