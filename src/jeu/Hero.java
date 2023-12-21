package jeu;

public abstract class Hero extends Personnage{
	
	private int intelligence;
	private int epee;

	public Hero(int musculation, int lachete,int endurance, int sante, int intelligence, int epee) {
		super(musculation, lachete, endurance, sante);
		this.intelligence = intelligence;
		this.epee = epee;
	}
	
	public abstract void gifle(Monstre monstre);
	public abstract void coupSpecial(Monstre monstre);
}
