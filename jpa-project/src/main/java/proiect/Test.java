package proiect;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tranzactii tranzactie1= new Tranzactii(1,11);
		Tranzactii tranzactie2= new Tranzactii(2,22);
		Tranzactii tranzactie3= new Tranzactii(3,33);
		Tranzactii tranzactie4= new Tranzactii(4,44);
		Tranzactii tranzactie5= new Tranzactii(5,55);
		Tranzactii tranzactie6= new Tranzactii(6,66);
		Tranzactii tranzactie7= new Tranzactii(7,77);
		Tranzactii tranzactie8= new Tranzactii(8,88);
		Tranzactii tranzactie9= new Tranzactii(9,99);
		Tranzactii tranzactie10= new Tranzactii(10,100);
		ArrayList<Tranzactii> totalTranzactii = new ArrayList<>();
		totalTranzactii.add(tranzactie1);
		totalTranzactii.add(tranzactie2);
		totalTranzactii.add(tranzactie3);
		totalTranzactii.add(tranzactie4);
		totalTranzactii.add(tranzactie5);
		totalTranzactii.add(tranzactie6);
		totalTranzactii.add(tranzactie7);
		totalTranzactii.add(tranzactie8);
		totalTranzactii.add(tranzactie9);
		totalTranzactii.add(tranzactie10);
		
		
		ArrayList<Tranzactii> listaTranzactii1 = new ArrayList<>();
		ArrayList<Tranzactii> listaTranzactii2 = new ArrayList<>();
		ArrayList<Tranzactii> listaTranzactii3 = new ArrayList<>();
		ArrayList<Tranzactii> listaTranzactii4 = new ArrayList<>();
		ArrayList<Tranzactii> listaTranzactii5 = new ArrayList<>();
		listaTranzactii1.add(tranzactie1);	
		listaTranzactii1.add(tranzactie2);	
		listaTranzactii2.add(tranzactie3);	
		listaTranzactii2.add(tranzactie4);	
		listaTranzactii3.add(tranzactie5);	
		listaTranzactii3.add(tranzactie6);
		listaTranzactii4.add(tranzactie7);	
		listaTranzactii4.add(tranzactie8);
		listaTranzactii5.add(tranzactie9);	
		listaTranzactii5.add(tranzactie10);
		TipTranzactii tipTranzactie1 = new TipTranzactii(1,"tranzactie1",listaTranzactii1);
		TipTranzactii tipTranzactie2 = new TipTranzactii(2,"tranzactie2",listaTranzactii2);
		TipTranzactii tipTranzactie3 = new TipTranzactii(3,"tranzactie3",listaTranzactii3);
		TipTranzactii tipTranzactie4 = new TipTranzactii(4,"tranzactie4",listaTranzactii4);
		TipTranzactii tipTranzactie5 = new TipTranzactii(5,"tranzactie5",listaTranzactii5);
		
		Conturi cont1= new Conturi(1,100,listaTranzactii1);
		Conturi cont2= new Conturi(2,200,listaTranzactii2);
		Conturi cont3= new Conturi(3,300,listaTranzactii3);
		Conturi cont4= new Conturi(4,400,listaTranzactii4);
		Conturi cont5= new Conturi(5,500,listaTranzactii5);
		
		ArrayList<Conturi> listaConturi1 = new ArrayList<>();
		ArrayList<Conturi> listaConturi2 = new ArrayList<>();
		ArrayList<Conturi> listaConturi3 = new ArrayList<>();		
		listaConturi1.add(cont1);
		listaConturi1.add(cont2);		
		listaConturi2.add(cont3);
		listaConturi2.add(cont4);
		listaConturi3.add(cont5);
		StatusCont statusCont1 = new StatusCont(1,"ok",listaConturi1);
		StatusCont statusCont2 = new StatusCont(2,"bine",listaConturi2);
		StatusCont statusCont3 = new StatusCont(3,"excelent",listaConturi3);
		TipCont tipCont1 = new TipCont(1,"premium",listaConturi1);
		TipCont tipCont2 = new TipCont(2,"student",listaConturi2);
		TipCont tipCont3 = new TipCont(3,"exclusiv",listaConturi3);
		Clienti client1 = new Clienti(1,"are 21 de ani","are telefon",listaConturi1);
		Clienti client2 = new Clienti(2,"are 22 de ani","nu are telefon",listaConturi2);
		Clienti client3 = new Clienti(3,"are 23 de ani", "are telefon",listaConturi3);
		
		ClientiFideli clientFidel1 = new ClientiFideli(9,"are 33 de ani", "are telefon",listaConturi1,"este client de 10 ani");
		
		ArrayList<Clienti> listaClienti1 = new ArrayList<>();
		ArrayList<Clienti> listaClienti2 = new ArrayList<>();
		Filiala filiala1 = new Filiala(1,"Iasi",listaClienti1);
		Filiala filiala2 = new Filiala(2,"Bucuresti",listaClienti2);
		
		ArrayList<Filiala> listaFiliale1 = new ArrayList<>();
		listaFiliale1.add(filiala1);
		listaFiliale1.add(filiala2);
		Adrese adresa1 = new Adrese(1,"Iasi","Iasi","Romania",listaFiliale1,listaClienti1);
		Adrese adresa2 = new Adrese(2,"Bucuresti","Ilfov","Romania",listaFiliale1,listaClienti1);
		
		TipFiliala tipFiliala1 = new TipFiliala(1,"Iasi",listaFiliale1);
		Banci banca1 = new Banci(1,"Bucuresti",listaFiliale1);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-project");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.createQuery("DELETE FROM Tranzactii").executeUpdate();
		entityManager.createQuery("DELETE FROM TipTranzactii").executeUpdate();
		entityManager.createQuery("DELETE FROM Conturi").executeUpdate();
		entityManager.createQuery("DELETE FROM StatusCont").executeUpdate();
		entityManager.createQuery("DELETE FROM TipCont").executeUpdate();
		entityManager.createQuery("DELETE FROM Clienti").executeUpdate();
		entityManager.createQuery("DELETE FROM ClientiFideli").executeUpdate();
		entityManager.createQuery("DELETE FROM Filiala").executeUpdate();
		entityManager.createQuery("DELETE FROM Adrese").executeUpdate();
		entityManager.createQuery("DELETE FROM TipFiliala").executeUpdate();
		entityManager.createQuery("DELETE FROM Banci").executeUpdate();
		
		
		for(int i=0;i<totalTranzactii.size();i++) {
			entityManager.persist(totalTranzactii.get(i));
		}
		entityManager.persist(tipTranzactie1);
		entityManager.persist(tipTranzactie2);
		entityManager.persist(tipTranzactie3);
		entityManager.persist(tipTranzactie4);
		entityManager.persist(tipTranzactie5);
		entityManager.persist(cont1);
		entityManager.persist(cont2);
		entityManager.persist(cont3);
		entityManager.persist(cont4);
		entityManager.persist(cont5);
		entityManager.persist(statusCont1);
		entityManager.persist(statusCont2);
		entityManager.persist(statusCont3);
		entityManager.persist(tipCont1);
		entityManager.persist(tipCont2);
		entityManager.persist(tipCont3);
		entityManager.persist(client1);
		entityManager.persist(client2);
		entityManager.persist(client3);
		entityManager.persist(clientFidel1);
		entityManager.persist(filiala1);
		entityManager.persist(filiala2);
		entityManager.persist(adresa1);
		entityManager.persist(adresa2);
		entityManager.persist(tipFiliala1);
		entityManager.persist(banca1);
		entityManager.getTransaction().commit();
		
		
		List<Adrese> adreseSelectate = entityManager.createQuery("SELECT a from Adrese a").getResultList(); 
		List<Banci> banciSelectate = entityManager.createQuery("SELECT b from Banci b").getResultList();
		List<Clienti> clientiSelectate= entityManager.createQuery("SELECT cl from Clienti cl").getResultList();
		List<Conturi> conturiSelectate = entityManager.createQuery("SELECT co from Conturi co").getResultList(); 
		List<Filiala> filialaSelectate = entityManager.createQuery("SELECT f from Filiala f").getResultList();
		List<StatusCont> statusContSelectate = entityManager.createQuery("SELECT sc from StatusCont sc").getResultList();
		List<TipCont>  tipContSelectate = entityManager.createQuery("SELECT tc from TipCont tc").getResultList(); 
		List<TipFiliala> tipFilialaSelectate = entityManager.createQuery("SELECT tf from TipFiliala tf").getResultList();
		List<TipTranzactii> tipTranzactiiSelectate = entityManager.createQuery("SELECT tt from TipTranzactii tt").getResultList();
		List<Tranzactii> tranzactiiSelectate = entityManager.createQuery("SELECT tr from Tranzactii tr").getResultList(); 
		
		System.out.print("Toate adresele: \n");
		for(Adrese ad : adreseSelectate)
			System.out.println(ad);
		System.out.println();
		System.out.print("Toate bancile sunt: \n");
		for(Banci banca : banciSelectate)
			System.out.println(banca);
		System.out.println();
		System.out.print("Toti clientii sunt: \n");
		for(Clienti client : clientiSelectate)
			System.out.println(client);
		System.out.println();
		System.out.print("Toate conturile sunt: \n");
		for(Conturi cont : conturiSelectate)
			System.out.println(cont);
		System.out.println();
		System.out.print("Toate filialele sunt: \n");
		for(Filiala filiala : filialaSelectate)
			System.out.println(filiala);
		System.out.println();
		System.out.print("Toate statusurile de cont sunt: \n");
		for(StatusCont status : statusContSelectate)
			System.out.println(status);
		System.out.println();
		System.out.print("Toate tipurile de cont sunt: \n");
		for(TipCont tipCont : tipContSelectate)
			System.out.println(tipCont);
		System.out.println();
		System.out.print("Toate tipurile de filiala sunt: \n");
		for(TipFiliala tipFiliala : tipFilialaSelectate)
			System.out.println(tipFiliala);
		System.out.println();
		System.out.print("Toate tipurile de tranzactii sunt: \n");
		for(TipTranzactii tipTranzactie : tipTranzactiiSelectate)
			System.out.println(tipTranzactie);
		System.out.println();
		System.out.print("Toate tranzactiile sunt: \n");
		for(Tranzactii tranzactie : tranzactiiSelectate)
			System.out.println(tranzactie);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
