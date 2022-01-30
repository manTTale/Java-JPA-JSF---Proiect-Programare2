package proiect;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatusCont {
	@Id
	private Integer codStatus;
	private String descriereStatus;
	@OneToMany(mappedBy = "statusCont")	
	private ArrayList<Conturi> conturi;
	public StatusCont(Integer codStatus, String descriereStatus, ArrayList<Conturi> conturi) {
		super();
		this.codStatus = codStatus;
		this.descriereStatus = descriereStatus;
		this.conturi = conturi;
	}
	public StatusCont() {
		
	}
	public Integer getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(Integer codStatus) {
		this.codStatus = codStatus;
	}
	public String getDescriereStatus() {
		return descriereStatus;
	}
	public void setDescriereStatus(String descriereStatus) {
		this.descriereStatus = descriereStatus;
	}
	public ArrayList<Conturi> getConturi() {
		return conturi;
	}
	public void setConturi(ArrayList<Conturi> conturi) {
		this.conturi = conturi;
	}
	@Override
	public String toString() {
		return "StatusCont [codStatus=" + codStatus + ", descriereStatus=" + descriereStatus + ", conturi=" + conturi
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codStatus, conturi, descriereStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusCont other = (StatusCont) obj;
		return Objects.equals(codStatus, other.codStatus) && Objects.equals(conturi, other.conturi)
				&& Objects.equals(descriereStatus, other.descriereStatus);
	}
	
	
	

}
