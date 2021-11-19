Soit les suivantes:
	Employe(int id,String nom,String prenom,String sexe,String naissance,double salaireBrut) ayant comme methode employer(),calculSalire()
Les classes suivantes sont les classes filles de Employe
	Externe(double primeDeplacement,double primeRisque) ayant pour methodes externe(), calculSalaire()
	Interne(double primeLogement,double primeRendement) ayant pour methodes interne(), calculSalaire()
1. Implémenter en Java ce diagramme
2. Définir dans la classe Employé un constructeur prenant en paramètre l’id, nom, prénom,
sexe, date naissance, prime et le salaire brute;
3. Définir dans les sous classes Externe et Interne un constructeur avec paramètres
permettant de les instancier.
4. Ajouter les modificateurs d’accès (getters, setters) à chacune des classes Employe,
Externe et Interne.
5. Implémenter la méthode calculSalaire() dans chacune des classe Employe, Externe et
Interne., sachant que le salaire d’un employé est la somme de son salaire brute et de ses
primes ;
6. Implémenter dans chacune des classes Employe, Externe et Interne une méthode
toString() qui affiche le nom, prénom, le sexe, l’âge, le salaire et le type d’employé (externe
ou interne)
7. Dans une classe contenant la méthode main (String [] args) {}
7.1. Instancier 4 employés en utilisant les jeux de données à votre convenance.