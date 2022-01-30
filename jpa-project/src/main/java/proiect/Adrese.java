package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adrese {
	@Id
	private Integer idAdresa;
	private String oras;
	private String judet;
	private String tara;
	@OneToMany(mappedBy = "adrese")
	private ArrayList<Filiala> filiala;
	@OneToMany(mappedBy = "adrese")
	private ArrayList<Clienti> clienti;
	public Adrese(Integer idAdresa, String oras, String judet, String tara, ArrayList<Filiala> filiala,
			ArrayList<Clienti> clienti) {
		super();
		this.idAdresa = idAdresa;
		this.oras = oras;
		this.judet = judet;
		this.tara = tara;
		this.filiala = filiala;
		this.clienti = clienti;
	}
	public Adrese() {
		
	}
	public Integer getIdAdresa() {
		return idAdresa;
	}
	public void setIdAdresa(Integer idAdresa) {
		this.idAdresa = idAdresa;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	public String getJudet() {
		return judet;
	}
	public void setJudet(String judet) {
		this.judet = judet;
	}
	public String getTara() {
		return tara;
	}
	public void setTara(String tara) {
		this.tara = tara;
	}
	public ArrayList<Filiala> getFiliala() {
		return filiala;
	}
	public void setFiliala(ArrayList<Filiala> filiala) {
		this.filiala = filiala;
	}
	public ArrayList<Clienti> getClienti() {
		return clienti;
	}
	public void setClienti(ArrayList<Clienti> clienti) {
		this.clienti = clienti;
	}
	@Override
	public String toString() {
		return "Adrese [idAdresa=" + idAdresa + ", oras=" + oras + ", judet=" + judet + ", tara=" + tara + ", filiala="
				+ filiala + ", clienti=" + clienti + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(clienti, filiala, idAdresa, judet, oras, tara);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adrese other = (Adrese) obj;
		return Objects.equals(clienti, other.clienti) && Objects.equals(filiala, other.filiala)
				&& Objects.equals(idAdresa, other.idAdresa) && Objects.equals(judet, other.judet)
				&& Objects.equals(oras, other.oras) && Objects.equals(tara, other.tara);
	}
	
	
	
}
