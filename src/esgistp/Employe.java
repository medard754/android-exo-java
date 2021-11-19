package esgistp;

import java.util.Scanner;

public class Employe {

	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private String naissance;
	private double salairebrut=0;
	private double primeDeplacement;
	private double primeRisque;
	private double primeLogement;
	private double primeRendement;
	public  String  typeEmp;
	
	
	public Employe(int id,String nom,String prenom,String sexe,String naissance,String typeEmp,double salairebrut,double primeDeplacement, double primeRisque,double primeLogement,double primeRendement) {
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.naissance=naissance;
		this.typeEmp=typeEmp;
		this.salairebrut=salairebrut;
		this.primeDeplacement=primeDeplacement;
		this.primeRisque=primeRisque;
	}
	public int getid() {
		return id;
	}
	public void id(int id) {
		this.id=id;
	}
	
	//nom
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom=nom;
	}
	
	//prenom
	public String getprenom() {
		return prenom;
	}
	public void prenom(String prenom) {
		this.prenom=prenom;
	}
	
	//sexe
	public String getsexe() {
		return sexe;
	}
	public void setsexe(String sexe) {
		this.sexe=sexe;
	}
	
	//date de naissance
	public String getnaissance() {
		return naissance;
	}
	public void setnaissance(String naissance) {
		this.naissance=naissance;
	}
	//Type d'employe
	public String gettypeEmp() {
		return typeEmp;
	}
	public void settypeEmp(String typeEmp) {
		this.typeEmp=typeEmp;
	}
	//salaire brute
	public double getsalairebrut() {
		return salairebrut;
	}
	public void setsalairebrut(double salairebrut) {
		this.salairebrut=salairebrut;
	}
	
	Interne interne=null;
	double salaireInterne=interne.calculSalaire(2147855, 125485);
	Externe externe=null;
	double salaireExterne=interne.calculSalaire(147895, 125025);
	
	double calculSalaire(double salaireInterne,double salaireExterne) {
		
		return (salaireInterne+salaireExterne);
	}
	public void Employe() {
		//cet objet permet de récupérer les valeurs entré par le user
		Scanner scan=new Scanner(System.in);
		System.out.println("Entrer votre nom\n");
		nom=scan.next();
		System.out.println("Entrer votre prénom\n");
		prenom=scan.next();
		System.out.println("Entrer votre sexe\n");
		sexe=scan.next();
		System.out.println("Entrer votre Date de naissance\n");
		naissance=scan.next();
		System.out.println("Entrer votre salaire Brut\n");
		salairebrut=scan.nextInt();
		System.out.println("Entrer votre Type d'employe\n");
		typeEmp=scan.next();
		
		
	}
	String type=interne.typeEmploye();
	String type2=externe.typeEmploye();
	void tostring(int id,String nom,String prenom,String sexe,String naissance,double salairebrut) {
		System.out.println(this.id+" "+this.nom+" "+this.prenom+" "+this.sexe+" "+this.naissance+" "+type+" "+"Mon salaire est"+calculSalaire(salaireInterne, salaireExterne));
	}
}
