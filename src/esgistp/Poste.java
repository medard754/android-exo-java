package esgistp;

import java.util.Scanner;

public abstract class Poste {
	private int code;
	private String libPoste;
	
	public Poste(int code,String libPoste) {
		this.code=code;
		this.libPoste=libPoste;
		
	}
	public int getCode() {
		return code;
	}
	public void setcode(int code) {
		this.code=code;
	}
	public String getlibPoste() {
		return libPoste;
	}
	public void setlibPoste(String libPoste) {
		this.libPoste=libPoste;
	}
 public void Poste() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Entrer le code");
		code=scan.nextInt();
		System.out.println("Entrer le libellé");
		libPoste=scan.next();
	}
	abstract public void affiche(int prime);
}
