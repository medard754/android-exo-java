package esgistp;

import java.util.Scanner;

public class Externe extends Employe {
	private double primeDeplacement;
	private double primeRisque;
	public double salairebrut;
	
	public Externe(int id,String nom,String prenom,String sexe,String naissance,String typeEmp,double salairebrut,double primeDeplacement, double primeRisque,double primeLogement,double primeRendement) {
		super(id,nom,prenom,sexe,naissance,typeEmp,salairebrut,primeDeplacement,primeRisque,primeLogement, primeRendement);
	}
	//prime de deplacement
	public double getprimeDeplacement() {
		return primeDeplacement;
	}
	public void setprimeDeplacement(double primeDeplacement) {
		this.primeDeplacement=primeDeplacement;
	}
	//Prime du risque
	public double getprimeRisque() {
		return primeRisque;
	}
	public void setprimeRisque(double primeRisque) {
		this.primeRisque=primeRisque;
	}
	String typeEmploye() {
		return "Externe";
	}
	public void Externe() {
		//cet objet permet de récupérer les valeurs entré par le user
		Scanner scan=new Scanner(System.in);
		System.out.println("Entrer votre prime de déplacement\n");
		primeDeplacement=scan.nextDouble();
		System.out.println("\nEntrer votre prime de risque\n");
		primeRisque=scan.nextDouble();
		
	}
	//calcul salaire
	 double calculSalaire(double primeDeplacement,double primeRisque) {
		 primeDeplacement=this.primeDeplacement;
		 primeRisque=this.primeRisque;
		
		return salairebrut+primeRisque+primeDeplacement;
	}
}
