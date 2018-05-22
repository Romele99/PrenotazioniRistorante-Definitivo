
public class Ordinatore 
{
	
	public static int scambia (Prenotazione[] array, int pos1, int pos2)
	{
		Prenotazione s;
		if (pos1<0 || pos2<0 || pos1>=array.length || pos2>=array.length)
			return -1;
		else
		{
			s=array[pos1];
			array[pos1]=array[pos2];
			array[pos2]=s;
			return 0;
		}			
	}
	
	private static Prenotazione[] copiaArray(Prenotazione[] array)
	{
		Prenotazione[] arrayCopia=new Prenotazione[array.length];
		for (int i = 0; i < arrayCopia.length; i++) 
			arrayCopia[i]=array[i];
		return arrayCopia;
	}
	
	public static Prenotazione[] ordinaPrenotazioneCrescente(Prenotazione[] array)
	{
		Prenotazione[] arrayCopia=copiaArray(array);
		return arrayCopia;
		
		
	}
		
	
		
		
}
