import java.util.Scanner;

public class Menu 
{
	private String[] elencoVoci;
	int numeroVoci=0;
	
	public Menu (String[] elencoVoci)
	{
		numeroVoci = elencoVoci.length;
		this.elencoVoci=new String[numeroVoci];
		
		for (int i = 0; i < numeroVoci; i++)
			this.elencoVoci[i]=elencoVoci[i];
	}
	public int visualizzaMenu()
	{
		for (int i = 0; i < elencoVoci.length; i++)
			System.out.println(elencoVoci[i]);
	}
	public int sceltaMenu()
	{
		Scanner tastiera=new Scanner(System.in);
		boolean inputNumerico=true;
		int scelta= -1;
		do
		{
			inputNumerico = true;
			visualizzaMenu();
			System.out.println("Scegli:");
			
			
		
		
		
		
		
	}
	
	
	
	
}
