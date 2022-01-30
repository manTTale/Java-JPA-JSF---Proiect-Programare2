package jsfBanca;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.faces.validator.BeanValidator;

import proiect.Clienti;
@ManagedBean @SessionScoped
public class FormClienti {

	private Clienti client;
	private List<Clienti> clienti;
	EntityManager em;
	public FormClienti() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa-project");
		em = emf.createEntityManager();
		init();
	}
	private void init() {
		this.clienti = em.createQuery("SELECT c FROM Clienti c").getResultList();
		this.client = this.clienti.get(0);
	}
	public void prevClient(ActionEvent e) {
		Integer pozitie = this.clienti.indexOf(this.client);
		if(pozitie>0) this.client = this.clienti.get(pozitie-1);
		else this.client=this.clienti.get(0);
	}
	public void nextClient(ActionEvent e) {
		Integer pozitie = this.clienti.indexOf(this.client);
		if(pozitie<this.clienti.size()+1) 
			this.client=this.clienti.get(pozitie+1);
		else this.client=this.clienti.get(this.clienti.size()-1);
		
	}
	public Clienti getClient() {
		return client;
	}
	public void setClient(Clienti client) {
		this.client = client;
	}
	public List<Clienti> getClienti() {
		return clienti;
	}
	public void setClienti(List<Clienti> clienti) {
		this.clienti = clienti;
	}
	public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
