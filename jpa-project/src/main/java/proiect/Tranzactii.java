package proiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tranzactii {
	@Id
	private Integer idTranzactie;
	private Integer sumaTranzactie;
	@ManyToOne
	private Conturi conturi;
	@ManyToOne
	private TipTranzactii tipTranzactii;
	
	
	public Tranzactii(Integer idTranzactie, Integer sumaTranzactie) {
		super();
		this.idTranzactie = idTranzactie;
		this.sumaTranzactie = sumaTranzactie;
		
	}
	public Tranzactii() {
		
	}
	public Integer getIdTranzactie() {
		return idTranzactie;
	}
	public void setIdTranzactie(Integer idTranzactie) {
		this.idTranzactie = idTranzactie;
	}
	public Integer getSumaTranzactie() {
		return sumaTranzactie;
	}
	public void setSumaTranzactie(Integer sumaTranzactie) {
		this.sumaTranzactie = sumaTranzactie;
	}
	public Conturi getConturi() {
		return conturi;
	}
	public void setConturi(Conturi conturi) {
		this.conturi = conturi;
	}
	public TipTranzactii getTipTranzactii() {
		return tipTranzactii;
	}
	public void setTipTranzactii(TipTranzactii tipTranzactii) {
		this.tipTranzactii = tipTranzactii;
	}
	@Override
	public String toString() {
		return "Tranzactii [idTranzactie=" + idTranzactie + ", sumaTranzactie=" + sumaTranzactie + ", conturi="
				+ conturi + ", tipTranzactii=" + tipTranzactii + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(conturi, idTranzactie, sumaTranzactie, tipTranzactii);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tranzactii other = (Tranzactii) obj;
		return Objects.equals(conturi, other.conturi) && Objects.equals(idTranzactie, other.idTranzactie)
				&& Objects.equals(sumaTranzactie, other.sumaTranzactie)
				&& Objects.equals(tipTranzactii, other.tipTranzactii);
	}
	
	
	

	
}
