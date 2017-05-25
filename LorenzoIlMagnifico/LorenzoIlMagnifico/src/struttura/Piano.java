package struttura;

public class Piano extends Torre
{
	private int livello;
	private Carta card;
	private boolean familiarepresente;
	private int forzaminima;
	
	public int getLivello() 
	{
		return livello;
	}

	public void setLivello(int livello) 
	{
		this.livello = livello;
	}

	public Carta getCard() 
	{
		return card;
	}

	public void setCard(Carta card) 
	{
		this.card = card;
	}

	public boolean isFamiliarepresente() 
	{
		return familiarepresente;
	}

	public void setFamiliarepresente(boolean familiarepresente) 
	{
		this.familiarepresente = familiarepresente;
	}

	public int getForzaminima() 
	{
		return forzaminima;
	}

	public void setForzaminima(int forzaminima) 
	{
		this.forzaminima = forzaminima;
	}

	public Piano(int i)
	{
		livello = i;
		if (this.colore == ColoriCarteTorri.verde)
			card = new CartaTerritorio();
		else if (this.colore == ColoriCarteTorri.azzurro)
			card = new CartaPersonaggio();
		else if (this.colore == ColoriCarteTorri.giallo)
			card = new CartaEdificio();
		else if (this.colore == ColoriCarteTorri.viola)
			card = new CartaImpresa();
		familiarepresente = false;
		
		//definisco la forza minima che ad ogni piano serve
		switch(i)
		{
			case 1:
				forzaminima = 1;
				break;
			case 2:
				forzaminima = 3;
				break;
			case 3:
				forzaminima = 5;
				break;
			case 4:
				forzaminima = 7;
				break;
		}
	}
}
