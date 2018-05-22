import java.time.LocalDateTime;

public class Prenotazione 
{
	private String nome;
	private String cognome;
	private int posti;
	LocalDateTime dataOra;
	
	public Prenotazione(String nome, String cognome, int posti)
	{
		setNome(nome);
		setCognome(cognome);
		setPosti(posti);
		LocalDateTime dataOra;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public int getPosti()
	{
		return posti;
	}

	public void setPosti(int posti)
	{
		this.posti = posti;
	}
	
	public String toString()
	{
		return (getNome()+" "+getCognome()+" "+getPosti());
	}
}
