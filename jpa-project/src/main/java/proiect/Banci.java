package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banci {
	@Id
	private Integer idBanca;
	private String detaliiBanca;
	@OneToMany(mappedBy = "banca")
	private ArrayList<Filiala> filiala;
	public Banci(Integer idBanca, String detaliiBanca, ArrayList<Filiala> filiala) {
		super();
		this.idBanca = idBanca;
		this.detaliiBanca = detaliiBanca;
		this.filiala = filiala;
	}
	public Banci() {
		
	}
	public Integer getIdBanca() {
		return idBanca;
	}
	public void setIdBanca(Integer idBanca) {
		this.idBanca = idBanca;
	}
	public String getDetaliiBanca() {
		return detaliiBanca;
	}
	public void setDetaliiBanca(String detaliiBanca) {
		this.detaliiBanca = detaliiBanca;
	}
	public ArrayList<Filiala> getFiliala() {
		return filiala;
	}
	public void setFiliala(ArrayList<Filiala> filiala) {
		this.filiala = filiala;
	}
	@Override
	public String toString() {
		return "Banci [idBanca=" + idBanca + ", detaliiBanca=" + detaliiBanca + ", filiala=" + filiala + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(detaliiBanca, filiala, idBanca);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banci other = (Banci) obj;
		return Objects.equals(detaliiBanca, other.detaliiBanca) && Objects.equals(filiala, other.filiala)
				&& Objects.equals(idBanca, other.idBanca);
	}
	
	

	
	
}
