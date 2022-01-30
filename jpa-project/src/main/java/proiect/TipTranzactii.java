package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class TipTranzactii {
	@Id
	private Integer codTranzactie;
	private String descriereTranzactie;
	@OneToMany(mappedBy = "tipTranzactii")	
	private ArrayList<Tranzactii> tranzactii;
	public TipTranzactii(Integer codTranzactie, String descriereTranzactie, ArrayList<Tranzactii> tranzactii) {
		super();
		this.codTranzactie = codTranzactie;
		this.descriereTranzactie = descriereTranzactie;
		this.tranzactii = tranzactii;
	}
	public TipTranzactii() {
		
	}
	public Integer getCodTranzactie() {
		return codTranzactie;
	}
	public void setCodTranzactie(Integer codTranzactie) {
		this.codTranzactie = codTranzactie;
	}
	public String getDescriereTranzactie() {
		return descriereTranzactie;
	}
	public void setDescriereTranzactie(String descriereTranzactie) {
		this.descriereTranzactie = descriereTranzactie;
	}
	public ArrayList<Tranzactii> getTranzactii() {
		return tranzactii;
	}
	public void setTranzactii(ArrayList<Tranzactii> tranzactii) {
		this.tranzactii = tranzactii;
	}
	@Override
	public String toString() {
		return "TipTranzactii [codTranzactie=" + codTranzactie + ", descriereTranzactie=" + descriereTranzactie
				+ ", tranzactii=" + tranzactii + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codTranzactie, descriereTranzactie, tranzactii);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipTranzactii other = (TipTranzactii) obj;
		return Objects.equals(codTranzactie, other.codTranzactie)
				&& Objects.equals(descriereTranzactie, other.descriereTranzactie)
				&& Objects.equals(tranzactii, other.tranzactii);
	}
	
	
}
