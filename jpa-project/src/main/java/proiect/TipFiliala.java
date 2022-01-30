package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipFiliala {
	@Id
	private Integer codFiliala;
	private String descriereFiliala;
	@OneToMany(mappedBy = "tipFiliala")	
	private ArrayList<Filiala> filiala;
	public TipFiliala(Integer codFiliala, String descriereFiliala, ArrayList<Filiala> filiala) {
		super();
		this.codFiliala = codFiliala;
		this.descriereFiliala = descriereFiliala;
		this.filiala = filiala;
	}
	public TipFiliala() {
		
	}
	public Integer getCodFiliala() {
		return codFiliala;
	}
	public void setCodFiliala(Integer codFiliala) {
		this.codFiliala = codFiliala;
	}
	public String getDescriereFiliala() {
		return descriereFiliala;
	}
	public void setDescriereFiliala(String descriereFiliala) {
		this.descriereFiliala = descriereFiliala;
	}
	public ArrayList<Filiala> getFiliala() {
		return filiala;
	}
	public void setFiliala(ArrayList<Filiala> filiala) {
		this.filiala = filiala;
	}
	@Override
	public String toString() {
		return "TipFiliala [codFiliala=" + codFiliala + ", descriereFiliala=" + descriereFiliala + ", filiala="
				+ filiala + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codFiliala, descriereFiliala, filiala);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipFiliala other = (TipFiliala) obj;
		return Objects.equals(codFiliala, other.codFiliala) && Objects.equals(descriereFiliala, other.descriereFiliala)
				&& Objects.equals(filiala, other.filiala);
	}
	
	
}
