package jeu;

public class Ogre extends Monstre{

	private int arme;
	
	public Ogre() {
		super(10, 3, 100, 100, 12);
		this.arme = 15;
	}

	@Override
	public void rugir(Hero hero) {
		int sante = hero.getSante();
		sante-=5;
		hero.setSante(sante);
	}

	@Override
	public void coupDeSalete(Hero hero) {
		int sante = hero.getSante();
		sante-=15;
		hero.setSante(sante);
	}

	
	
}
