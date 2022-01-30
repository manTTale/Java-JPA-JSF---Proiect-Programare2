package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipCont {
	@Id
	private Integer codTipCont;
	private String descriereTipCont;
	@OneToMany(mappedBy = "tipCont")	
	private ArrayList<Conturi> conturi;
	public TipCont(Integer codTipCont, String descriereTipCont, ArrayList<Conturi> conturi) {
		super();
		this.codTipCont = codTipCont;
		this.descriereTipCont = descriereTipCont;
		this.conturi = conturi;
	}
	public TipCont() {
		
	}
	public Integer getCodTipCont() {
		return codTipCont;
	}
	public void setCodTipCont(Integer codTipCont) {
		this.codTipCont = codTipCont;
	}
	public String getDescriereTipCont() {
		return descriereTipCont;
	}
	public void setDescriereTipCont(String descriereTipCont) {
		this.descriereTipCont = descriereTipCont;
	}
	public ArrayList<Conturi> getConturi() {
		return conturi;
	}
	public void setConturi(ArrayList<Conturi> conturi) {
		this.conturi = conturi;
	}
	@Override
	public String toString() {
		return "TipCont [codTipCont=" + codTipCont + ", descriereTipCont=" + descriereTipCont + ", conturi=" + conturi
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codTipCont, conturi, descriereTipCont);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipCont other = (TipCont) obj;
		return Objects.equals(codTipCont, other.codTipCont) && Objects.equals(conturi, other.conturi)
				&& Objects.equals(descriereTipCont, other.descriereTipCont);
	}
	
	
	

}
