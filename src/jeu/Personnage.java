package jeu;

public abstract class Personnage {

	
	//Toutes les propriétés qui sont communes à nos 4 combattants
	 private int musculation;
	 private int lachete;
	 private int endurance;
	 private int sante;
	
	//Constructeur 
	public Personnage(int musculation, int lachete,int endurance, int sante) {
		this.musculation = musculation;
		this.lachete = lachete;
		this.endurance = endurance;
		this.sante = sante;
	}

	//lire la valeur de santé
	public int getSante() {
		return sante;
	}
	
	//
	public void setSante(int sante) {
		this.sante = sante;
	}
	
 	

}
