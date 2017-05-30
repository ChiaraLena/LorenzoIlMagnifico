package struttura;

public class SpazioChiesa extends Tabellone
{
	private TesseraScomunica[] chiesa = new TesseraScomunica[3];
	
	public SpazioChiesa()
	{
		chiesa = null;
	}
	
	public void NuoveTessere()
	{
		int rnd;
		for (int i=0; i<chiesa.length; i++)
		{
			 rnd = (int) (21 * Math.random());
			 
		}
	}
}
