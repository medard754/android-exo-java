package esgistp;

import java.nio.file.Paths;

public class principal {
	
	 Employe[][] tab;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Les employés");
		Employe Emp1=new Employe(1001,"Bill","MOUSSA","masculin","12/08/1999","Externe",255000,25480,55875,25874110,147852);
		Employe Emp2=new Employe(1001,"Bill","MOUSSA","masculin","12/08/1999","Interne",255000,25480,55875,25874110,147852);
		Employe Emp3=new Employe(1001,"Bill","MOUSSA","masculin","12/08/1999","Interne",255000,25480,55875,25874110,147852);
		Employe Emp4=new Employe(1001,"Bill","MOUSSA","masculin","12/08/1999","Externe",255000,25480,55875,25874110,147852);
		
		
		//Tester les methodes
		Interne interne=null;
		double salaireInterne=interne.calculSalaire(2000, 254789);
		Externe externe=null;
		double salaireExterne=externe.calculSalaire(257895, 987452);
		Employe emp=null;
		double Monsalaire=emp.calculSalaire(salaireInterne, salaireExterne)	;
		//mon fichier
		//Path fichier=Paths.get(chemin de depot);
		//Files.write(bill.txt,1001,"Bill","MOUSSA","masculin","12/08/1999","Externe",255000,25480,55875,25874110,147852,StandardOpenOption.APPEND);
		
	}

}
