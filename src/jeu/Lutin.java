package jeu;

public class Lutin extends Monstre{

	int salete;
	
	public Lutin() {
		super(8, 10, 100, 100, 8);
		this.salete = 15 ;
	}

	@Override
	public void rugir(Hero hero) {
		int sante = hero.getSante();
		sante-=10;
		hero.setSante(sante);
	}

	@Override
	public void coupDeSalete(Hero hero) {
		int sante = hero.getSante();
		sante-=4;
		hero.setSante(sante);
	}


}
