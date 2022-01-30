package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class Clienti {
	@Id
	@GeneratedValue(strategy = AUTO)
	private Integer idClient;
	private String detaliiClient;
	private String detaliiContact;
	@ManyToOne
	private Filiala filiala;
	@ManyToOne
	private Adrese adrese;
	@OneToMany(mappedBy = "clienti")
	private ArrayList<Conturi> conturi;
	public Clienti(Integer idClient, String detaliiClient, String detaliiContact,ArrayList<Conturi> conturi) {
		super();
		this.idClient = idClient;
		this.detaliiClient = detaliiClient;
		this.detaliiContact = detaliiContact;
		this.conturi = conturi;
	}
	public Clienti() {
		
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public String getDetaliiClient() {
		return detaliiClient;
	}
	public void setDetaliiClient(String detaliiClient) {
		this.detaliiClient = detaliiClient;
	}
	public String getDetaliiContact() {
		return detaliiContact;
	}
	public void setDetaliiContact(String detaliiContact) {
		this.detaliiContact = detaliiContact;
	}
	public Filiala getFiliala() {
		return filiala;
	}
	public void setFiliala(Filiala filiala) {
		this.filiala = filiala;
	}
	public Adrese getAdrese() {
		return adrese;
	}
	public void setAdrese(Adrese adrese) {
		this.adrese = adrese;
	}
	public ArrayList<Conturi> getConturi() {
		return conturi;
	}
	public void setConturi(ArrayList<Conturi> conturi) {
		this.conturi = conturi;
	}
	
	@Override
	public String toString() {
		return "Clienti [idClient=" + idClient + ", detaliiClient=" + detaliiClient + ", detaliiContact="
				+ detaliiContact + ", filiala=" + filiala + ", adrese=" + adrese + ", conturi=" + conturi + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adrese, conturi, detaliiClient, detaliiContact, filiala, idClient);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clienti other = (Clienti) obj;
		return Objects.equals(adrese, other.adrese) && Objects.equals(conturi, other.conturi)
				&& Objects.equals(detaliiClient, other.detaliiClient)
				&& Objects.equals(detaliiContact, other.detaliiContact) && Objects.equals(filiala, other.filiala)
				&& Objects.equals(idClient, other.idClient);
	}
	
	
	
}
