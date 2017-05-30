package struttura;

public class Scomunica extends Plancia
{
	private boolean[] scomunicato = new boolean[3];
	
	public Scomunica()
	{
		for (int i=0; i<scomunicato.length; i++)
			scomunicato[i] = false;
	}
	
	public void DaiScomunica(Turno t)
	{
		if (scomunicato[t.periodo] == true)
			return;
	}
}
