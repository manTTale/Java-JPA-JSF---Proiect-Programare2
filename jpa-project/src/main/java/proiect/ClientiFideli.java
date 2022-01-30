package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
@Entity
public class ClientiFideli extends Clienti{
	private String descriereClienti;

	public ClientiFideli(Integer idClient, String detaliiClient, String detaliiContact, ArrayList<Conturi> conturi,
			String descriereClienti) {
		super(idClient, detaliiClient, detaliiContact, conturi);
		this.descriereClienti = descriereClienti;
	}
	public ClientiFideli() {
		
	}

	public String getDescriereClienti() {
		return descriereClienti;
	}

	public void setDescriereClienti(String descriereClienti) {
		this.descriereClienti = descriereClienti;
	}
	@Override
	public String toString() {
		return "ClientiFideli [descriereClienti=" + descriereClienti + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(descriereClienti);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientiFideli other = (ClientiFideli) obj;
		return Objects.equals(descriereClienti, other.descriereClienti);
	}
	

}
