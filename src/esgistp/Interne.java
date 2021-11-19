package esgistp;

import java.util.Scanner;

public class Interne extends Employe  implements EMPLOYER
{

	
	private double primeLogement;
	private double primeRendement;
	public double salairebrut=0;
	
	public Interne(int id, String nom, String prenom, String sexe, String naissance,String typeEmp,double salairebrut,
			double primeDeplacement,double primeRisque,double primeLogement, double primeRendement) {
		super(id, nom, prenom, sexe, naissance,typeEmp,salairebrut,primeDeplacement,primeRisque,primeLogement, primeRendement);
	}
	
	//prime du Logement
	public double getprimeLogement() {
		return primeLogement;
	}
	public void setprimeLogement(double primeLogement) {
		this.primeLogement=primeLogement;
	}
	//Prime du Rendement
	public double getprimeRendement() {
		return primeRendement;
	}
	public void setprimeRendement(double primeRendement) {
		this.primeRendement=primeRendement;
	}
	String typeEmploye() {
		return "Interne";
	}
	public void Interne() {
		//cet objet permet de récupérer les valeurs entré par le user
		Scanner scan=new Scanner(System.in);
		System.out.println("Entrer votre prime de logement\n");
		primeLogement=scan.nextDouble();
		System.out.println("\nEntrer votre prime de rendement\n");
		primeRendement=scan.nextDouble();
		
	}
	//calcul salaire
	 double calculSalaire(double primeLogement,double primeRendement) {
		 primeLogement=this.primeLogement;
		 primeRendement=this.primeRendement;
		return salairebrut+primeLogement+primeRendement;
	}
	public void affiche(int prime){
		System.out.println("mon prime est"+prime);
	}
	public void fly(String toto){
		System.out.println("Je suis un employe"+ toto);
	}
}
