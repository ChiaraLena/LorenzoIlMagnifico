package struttura;

public abstract class Carta 
{
	private int periodo;
	private String nome;
	private ColoriCarteTorri colore;
	//creare una variabile per l'immagine della carta
	
	public int getPeriodo() 
	{
		return periodo;
	}

	public void setPeriodo(int periodo) 
	{
		this.periodo = periodo;
	}

	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public ColoriCarteTorri getColore() 
	{
		return colore;
	}
	
	public void setColore(ColoriCarteTorri colore) 
	{
		this.colore = colore;
	}

	public Carta()
	{
		periodo = 1;
	}
	
	public abstract Plancia EffettoImmediato();
	public abstract Plancia EffettoPermanente();
<<<<<<< HEAD
=======


>>>>>>> branch 'master' of https://github.com/ChiaraLena/LorenzoIlMagnifico.git
}
