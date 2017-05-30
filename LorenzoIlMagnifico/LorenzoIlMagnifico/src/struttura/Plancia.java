package struttura;

public class Plancia extends Giocatore
{
	private int monete;
	private int legna;
	private int pietre;
	private int privilegio;
	private int puntivit;
	private int puntimil;
	private int puntifed;
	private int servitori;
	
	final int MAX = 6;
	
	public CartaTerritorio[] carteTerritorio;
	public CartaEdificio[] carteEdificio;
	public CartaPersonaggio[] cartePersonaggio;
	public CartaImpresa[] carteImpresa;
	public int requisitominimo;
	
	public int getMonete() 
	{
		return monete;
	}

	public void setMonete(int monete) 
	{
		this.monete = monete;
	}
	
	public int getLegna() 
	{
		return legna;
	}

	public void setLegna(int legna) 
	{
		this.legna = legna;
	}

	public int getPietre() {
		return pietre;
	}

	public void setPietre(int pietre) 
	{
		this.pietre = pietre;
	}
	
	public int getPrivilegio() 
	{
		return privilegio;
	}

	public void setPrivilegio(int privilegio) 
	{
		this.privilegio = privilegio;
	}
	
	public int getPuntivit() 
	{
		return puntivit;
	}

	public void setPuntivit(int puntivit) 
	{
		this.puntivit = puntivit;
	}
	
	public int getPuntimil() 
	{
		return puntimil;
	}

	public void setPuntimil(int puntimil) 
	{
		this.puntimil = puntimil;
	}
	
	public int getPuntifed()
	{
		return puntifed;
	}

	public void setPuntifed(int puntifed) 
	{
		this.puntifed = puntifed;
	}

	public int getServitori() 
	{
		return servitori;
	}

	public void setServitori(int servitori)
	{
		this.servitori = servitori;
	}
	
	public Plancia()
	{
		monete = 5;
		legna = 2;
		servitori= 3;
		pietre=2;
		privilegio=0;
		for (int i = 0; i < MAX; i++)
		{
			carteTerritorio[i] = new CartaTerritorio();
			carteEdificio[i] = new CartaEdificio();
			cartePersonaggio[i] = new CartaPersonaggio();
			carteImpresa[i] = new CartaImpresa();
		}
		
		requisitominimo = 0;
	}
	
	public void InserisciCartaTerritorio(CartaTerritorio c)
	{
		for (int i = 0; i < MAX; i++)
		{
			if (carteTerritorio[i].getNome() == null)
			{
				if (i > 1)
				{	
					switch(i)
					{
						case 2:
							requisitominimo=3;
							break;
						case 3:
							requisitominimo=7;
							break;
						case 4:
							requisitominimo=12;
							break;
						case 5:
							requisitominimo=18;
							break;
					}
					if (puntimil >= requisitominimo)
					{
						carteTerritorio[i] = c;
						break;
					}
					//messaggio che dice che non si può prendere la carta perchè non si rispetta il requisito minimo
						break;
				}
				else 
				{
					carteTerritorio[i] = c;
					break;
				}
			}
		}		
	}
	
	public void InserisciCartaEdificio(CartaEdificio c)
	{
		for (int i = 0; i < MAX; i++)
		{
			if (carteEdificio[i].getNome() == null)
			{
				carteEdificio[i] = c;
				break;
			}
		}
	}
	
	public void InserisciCartaParsonaggio(CartaPersonaggio c)
	{
		for (int i = 0; i < MAX; i++)
		{
			if (cartePersonaggio[i].getNome() == null)
			{
				cartePersonaggio[i] = c;
				break;
			}
		}
	}
	
	public void InserisciCartaImpresa(CartaImpresa c)
	{
		for (int i = 0; i < MAX; i++)
		{
			if (carteImpresa[i].getNome() == null)
			{
				carteImpresa[i] = c;
				break;
			}
		}
	}
	
	//manca l'assegnamento dei puntivit a secondo di quanti puntimil si hanno
	public int PunteggiFinali()
	{
		for(int i=0; i<MAX; i++)
		{
			if(carteTerritorio[i].getNome().equals(null))
			{
				switch (i-1)
				{
					case 3:
						puntivit ++;
						break;
					case 4:
						puntivit += 4;
						break;
					case 5:
						puntivit += 10;
						break;
					case 6:
						puntivit += 20;
						break;
					default:
						break;
				}
			}
		}
		
		for(int i=0; i<MAX; i++)
		{
			if(cartePersonaggio[i].getNome().equals(null))
			{
				switch (i-1)
				{
					case 1:
						puntivit ++;
						break;
					case 2:
						puntivit += 3;
						break;
					case 3:
						puntivit += 6;
						break;
					case 4:
						puntivit += 10;
						break;
					case 5:
						puntivit += 15;
						break;
					case 6:
						puntivit += 21;
						break;
					default:
						break;
				}
			}
		}
		
		for(int i=0; i<MAX; i++)
		{
			puntivit += carteImpresa[i].getPuntivittoriaassegnati();
		}
		
		int tutterisorse = monete + legna + pietre + servitori;
		puntivit += (int) (tutterisorse/5);
		
		return puntivit;
	}
}
