package struttura;

public class CartaImpresa extends Carta
{
<<<<<<< HEAD
	
	private int costomoneta;
	private int costolegno;
	private int costopietra;
	private int costoservitore;
	private int costopuntomilitare;
	private int puntivittoriaassegnati;
	Plancia pl;
	
	public int getCostomoneta() 
	{
		return costomoneta;
	}

	public void setCostomoneta(int costomoneta) 
	{
		this.costomoneta = costomoneta;
	}

	public int getCostolegno() 
	{
		return costolegno;
	}

	public void setCostolegno(int costolegno) 
	{
		this.costolegno = costolegno;
	}

	public int getCostopietra() 
	{
		return costopietra;
	}

	public void setCostopietra(int costopietra) 
	{
		this.costopietra = costopietra;
	}

	public int getCostoservitore() 
	{
		return costoservitore;
	}

	public void setCostoservitore(int costoservitore) 
	{
		this.costoservitore = costoservitore;
	}

	public int getCostopuntomilitare() 
	{
		return costopuntomilitare;
	}

	public void setCostopuntomilitare(int costopuntomilitare) 
	{
		this.costopuntomilitare = costopuntomilitare;
	}

	public int getPuntivittoriaassegnati() 
	{
		return puntivittoriaassegnati;
	}

	public void setPuntivittoriaassegnati(int puntivittoriaassegnati) 
	{
		this.puntivittoriaassegnati = puntivittoriaassegnati;
	}
	
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
	@Override
	public Plancia EffettoPermanente() {
		// TODO Auto-generated method stub
		pl=new Plancia();
		return pl;
	}
=======
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

	
>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
}
