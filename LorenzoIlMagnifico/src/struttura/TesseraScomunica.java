
public class TesseraScomunica {
	
	int periodo;
	int contatoreCarta;
	final int MAX=21;
	public TesseraScomunica[] tessere;
	Plancia pl;
	Giocatore g;
	Familiare f;
	public TesseraScomunica() {
		
		for(contatoreCarta=0; contatoreCarta<MAX; contatoreCarta++) {
			
			tessere[contatoreCarta]=new TesseraScomunica();
		
		}
		
		switch(contatoreCarta) {
		
			case 1:
				pl.setPuntimil(pl.getPuntimil() - 1);
				periodo=1;
				break;
				
			case 2:
				pl.setMonete(pl.getMonete()-1);
				periodo=1;
				break;
				
			case 3:
				pl.setServitori(pl.getServitori()-1);
				periodo=1;
				break;
				
			case 4:
				pl.setLegna(pl.getLegna()-1);
				pl.setPietre(pl.getPietre()-1);
				periodo=1;
				break;
				
			case 5:
				//carta che dimuisce di 3 il valore di un'azione di raccolto
				periodo=1;
				break;
				
			case 6:
				//carta che diminuisce di 3 il valore di un'azione di produzione
				periodo=1;
				break;
			
			case 7:
				f=g.getFbianco();
				f.setForza(f.getForza()-1);
				periodo=1;
				break;
				
			case 8:
				//carta che diminuisce di 4 il valore dell'azione di una carta territorio
				periodo=2;
				break;
				
			case 9:
				//carta che diminuisce di 4 il valore dell'azione di una carta edificio
				periodo=2;
				break;
			
			case 10:
				//carta che diminuisce di 4 il valore dell'azione di una carta personaggio
				periodo=2;
				break;
				
			case 11:
				//carta che diminuisce di 4 il valore dell'azione di una carta impresa
				periodo=2;
				break;
		
			case 12:
				//carta che non permette di piazzare un familiare sul mercato
				periodo=2;
				break;
		
			case 13:
				//carta per cui si devono spendere 2 servitori per aumentare l'azione di 1
				periodo=2;
				break;
				
			case 14:
				//carta che fa diventare ultimo il giocatore
				periodo=2;
				break;
				
			case 15:
				//carta che annula i punti vittoria dalle carte personaggio
				periodo=3;
				break;
				
			case 16:
				//carta che annulla i punti vittoria dalle carte impresa
				periodo=3;
				break;
				
			case 17:
				//carta che annulla i punti vittoria dalle carte territorio
				periodo=3;
				break;
				
			case 18:
				//carta che toglie un punto vittoria ogni 5
				periodo=3;
				break;
				
			case 19:
				//carta che toglie un punto vittoria per ogni punto militare
				periodo=3;
				break;
				
			case 20:
				//carta che toglie un punto vittoria ogni legno/pietra dei costi delle carte edificio
				periodo=3;
				break;
				
			case 21:
				//carta che toglie un punto vittoria ogni risorsa presente nella plancia alla fine della partita
				periodo=3;
				break;
				
		}
		
	}
	

	
	
	
}
