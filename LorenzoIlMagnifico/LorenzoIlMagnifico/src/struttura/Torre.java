package struttura;

public class Torre 
{
	public ColoriCarteTorri colore;
	public Piano piano1;
	public Piano piano2;
	public Piano piano3;
	public Piano piano4;
	
	public Torre()
	{}
	
	public Torre(int i)
	{
		switch(i)
		{
			case 0:
				colore=ColoriCarteTorri.verde;
				break;
			case 1:
				colore=ColoriCarteTorri.azzurro;
				break;
			case 2:
				colore=ColoriCarteTorri.giallo;
				break;
			case 3:
				colore=ColoriCarteTorri.viola;
				break;
		}
		
		//creo i 4 piani di ogni torre
		piano1 = new Piano(1);
		piano2 = new Piano(2);
		piano3 = new Piano(3);
		piano4 = new Piano(4);
	}
}
