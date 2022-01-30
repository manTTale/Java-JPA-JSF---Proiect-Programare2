package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Conturi {
	@Id
	private Integer nrCont;
	private Integer balantaCont;
	@ManyToOne
	private Clienti clienti;
	@ManyToOne
	private StatusCont statusCont;
	@ManyToOne
	private TipCont tipCont;
	@OneToMany(mappedBy = "conturi")	
	private ArrayList<Tranzactii> tranzactii;
	public Conturi(Integer nrCont, Integer balantaCont, ArrayList<Tranzactii> tranzactii) {
		super();
		this.nrCont = nrCont;
		this.balantaCont = balantaCont;
		this.tranzactii = tranzactii;
	}
	public Conturi() {
		
	}
	public Integer getNrCont() {
		return nrCont;
	}
	public void setNrCont(Integer nrCont) {
		this.nrCont = nrCont;
	}
	public Integer getBalantaCont() {
		return balantaCont;
	}
	public void setBalantaCont(Integer balantaCont) {
		this.balantaCont = balantaCont;
	}
	public Clienti getClienti() {
		return clienti;
	}
	public void setClienti(Clienti clienti) {
		this.clienti = clienti;
	}
	public StatusCont getStatusCont() {
		return statusCont;
	}
	public void setStatusCont(StatusCont statusCont) {
		this.statusCont = statusCont;
	}
	public TipCont getTipCont() {
		return tipCont;
	}
	public void setTipCont(TipCont tipCont) {
		this.tipCont = tipCont;
	}
	public ArrayList<Tranzactii> getTranzactii() {
		return tranzactii;
	}
	public void setTranzactii(ArrayList<Tranzactii> tranzactii) {
		this.tranzactii = tranzactii;
	}
	@Override
	public String toString() {
		return "Conturi [nrCont=" + nrCont + ", balantaCont=" + balantaCont + ", clienti=" + clienti + ", statusCont="
				+ statusCont + ", tipCont=" + tipCont + ", tranzactii=" + tranzactii + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(balantaCont, clienti, nrCont, statusCont, tipCont, tranzactii);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conturi other = (Conturi) obj;
		return Objects.equals(balantaCont, other.balantaCont) && Objects.equals(clienti, other.clienti)
				&& Objects.equals(nrCont, other.nrCont) && Objects.equals(statusCont, other.statusCont)
				&& Objects.equals(tipCont, other.tipCont) && Objects.equals(tranzactii, other.tranzactii);
	}
	
	
	
}
