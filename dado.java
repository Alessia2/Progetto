package dado;
import java.util.Random;

public class dado {
	private int nfacce;
	private Random r;
	public dado()
	{
		nfacce=6;
		r=new Random();
	}
	
	int lancia()
	{
		int risultato = r.nextInt(nfacce) + 1; // +1 altrimenti parte da zero
		return risultato;
	}
	

}
