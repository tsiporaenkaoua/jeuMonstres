package jeu;

public class Chevalier extends Hero{

	public Chevalier() {
		super(15, 5, 100, 100, 8, 12);
	}

	@Override
	public void gifle(Monstre monstre) {
		int sante = monstre.getSante();
		sante-=15;
		monstre.setSante(sante);
	}

	@Override
	public void coupSpecial(Monstre monstre) {
		int sante = monstre.getSante();
		sante-=8;
		monstre.setSante(sante);
	}

}
