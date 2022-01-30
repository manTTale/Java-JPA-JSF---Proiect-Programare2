package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filiala {
	@Id
	private Integer idFiliala;
	private String detaliiFiliala;
	@ManyToOne
	private Banci banca;
	@ManyToOne
	private Adrese adrese;
	@ManyToOne
	private TipFiliala tipFiliala;
	@OneToMany(mappedBy = "filiala")	
	private ArrayList<Clienti> clienti;
	public Filiala(Integer idFiliala, String detaliiFiliala,ArrayList<Clienti> clienti) {
		super();
		this.idFiliala = idFiliala;
		this.detaliiFiliala = detaliiFiliala;		
		this.clienti = clienti;
	}
	public Filiala() {
		
	}
	public Integer getIdFiliala() {
		return idFiliala;
	}
	public void setIdFiliala(Integer idFiliala) {
		this.idFiliala = idFiliala;
	}
	public String getDetaliiFiliala() {
		return detaliiFiliala;
	}
	public void setDetaliiFiliala(String detaliiFiliala) {
		this.detaliiFiliala = detaliiFiliala;
	}
	public Banci getBanca() {
		return banca;
	}
	public void setBanca(Banci banca) {
		this.banca = banca;
	}
	public Adrese getAdrese() {
		return adrese;
	}
	public void setAdrese(Adrese adrese) {
		this.adrese = adrese;
	}
	public TipFiliala getTipFiliala() {
		return tipFiliala;
	}
	public void setTipFiliala(TipFiliala tipFiliala) {
		this.tipFiliala = tipFiliala;
	}
	public ArrayList<Clienti> getClienti() {
		return clienti;
	}
	public void setClienti(ArrayList<Clienti> clienti) {
		this.clienti = clienti;
	}
	@Override
	public String toString() {
		return "Filiala [idFiliala=" + idFiliala + ", detaliiFiliala=" + detaliiFiliala + ", banca=" + banca
				+ ", adrese=" + adrese + ", tipFiliala=" + tipFiliala + ", clienti=" + clienti + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adrese, banca, clienti, detaliiFiliala, idFiliala, tipFiliala);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filiala other = (Filiala) obj;
		return Objects.equals(adrese, other.adrese) && Objects.equals(banca, other.banca)
				&& Objects.equals(clienti, other.clienti) && Objects.equals(detaliiFiliala, other.detaliiFiliala)
				&& Objects.equals(idFiliala, other.idFiliala) && Objects.equals(tipFiliala, other.tipFiliala);
	}
	
	
	
	
}
