package jeu;

public class Princesse extends Hero{

	public Princesse() {
		super(6, 2, 120, 100, 15, 6);
	}
	

	@Override
	public void gifle(Monstre monstre) {
		int sante = monstre.getSante();
		sante-=10;
		monstre.setSante(sante);
	}

	@Override
	public void coupSpecial(Monstre monstre) {
		int sante = monstre.getSante();
		sante-=12;
		monstre.setSante(sante);
	}

}
