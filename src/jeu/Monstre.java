package jeu;

public abstract class Monstre extends Personnage {
	
	private int mechancete;

	public Monstre(int musculation, int lachete,int endurance, int sante, int mechancete) {
		super(musculation, lachete, endurance, sante);
		this.mechancete = mechancete;
		
	}
	
	
	public abstract void rugir(Hero hero);
	public abstract void coupDeSalete(Hero hero);

}
