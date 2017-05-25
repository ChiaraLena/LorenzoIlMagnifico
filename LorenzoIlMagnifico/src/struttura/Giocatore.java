package struttura;

public class Giocatore extends Thread
{
	private String nome;
	private Plancia pl;
	private Familiare fbianco;
	private Familiare fnero;
	private Familiare farancione;
	private Familiare fneutro;
	private Scomunica sco;
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public Plancia getPl() 
	{
		return pl;
	}

	public void setPl(Plancia pl) 
	{
		this.pl = pl;
	}

	public Familiare getFbianco() 
	{
		return fbianco;
	}

	public void setFbianco(Familiare fbianco) 
	{
		this.fbianco = fbianco;
	}

	public Familiare getFnero() 
	{
		return fnero;
	}

	public void setFnero(Familiare fnero) 
	{
		this.fnero = fnero;
	}

	public Familiare getFarancione() {
		return farancione;
	}

	public void setFarancione(Familiare farancione) 
	{
		this.farancione = farancione;
	}

	public Familiare getFneutro() 
	{
		return fneutro;
	}

	public void setFneutro(Familiare fneutro) 
	{
		this.fneutro = fneutro;
	}

	public Scomunica getScomunica() 
	{
		return sco;
	}

	public void setScomunica(Scomunica sco) 
	{
		this.sco = sco;
	}

	public Giocatore()
	{}
	
	public Giocatore(String n)
	{
		nome = n;
		fbianco = new Familiare(0);
		fnero = new Familiare(1);
		farancione = new Familiare(2);
		fneutro = new Familiare(3);
	}
}
