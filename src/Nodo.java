
public class Nodo 
{
	private Prenotazione info;
	private Nodo link;
	
	public Nodo (Prenotazione cliente)
	{
		setInfo(cliente);
		setLink(null);
	}

	public Prenotazione getInfo() 
	{
		return info;
	}

	public void setInfo(Prenotazione info) 
	{
		this.info = info;
	}

	public Nodo getLink() 
	{
		return link;
	}

	public void setLink(Nodo link) 
	{
		this.link = link;
	}
}
