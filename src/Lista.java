
public class Lista 
{
	private Nodo head;
	private int Ordine;
	
	public Lista()
	{
		head=null;
		Ordine=0;
	}
	
	public int getOrdine()
	{
		return Ordine;
	}
	
	private Nodo creaNodo(Prenotazione cliente, Nodo link)
	{
		Nodo nodo=new Nodo(cliente);
		nodo.setLink(link);
		return nodo;
	}
	
	public Nodo getLinkPosizione(int posizione) throws ListaException
	{
		if (Ordine==0)
			throw new ListaException("Lista vuota");
		if (posizione<=0 || posizione>Ordine)
			throw new ListaException("Posizione non valida");
		
		Nodo p=head;
		int n=1;
		while(p.getLink()!=null && n<posizione)
		{
			p=p.getLink();
			n++;
		}
		return p;
	}
	
	public String toString()
	{
		String risultato="Head";
		if (Ordine==0)
			return risultato;
		Nodo p=head;
		while(p!=null)
		{
			risultato+="-->"+p.getInfo().getNome();
			p=p.getLink();
		}
		
		return risultato;
		
	}
	
	public void inserisciInTesta(Prenotazione persona)
	{
		Nodo p=creaNodo(persona, head);
		head=p;
		Ordine++;
	}	
	
	public void esportaCSV (String nomeFile)
	{
		TextFile prenotazioniEliminate= new TextFile (nomeFile,'W');
		String PrenotazioneCSV;
		Prenotazione cliente;
		
		for (int i = 1; i <= getElementi(); i++)
		{
			cliente=getCliente(i);
			PrenotazioneCSV=persona.getNome()+";"+persona.getCognome()+";"+persona.getPosti()+";"+persona.getdataOra()+";"; 
			file.toFile(PrenotazioneCSV);
		}
		file.closeFile();
		
	}
	
	
	
	
	
	
	
	
	
	
}
