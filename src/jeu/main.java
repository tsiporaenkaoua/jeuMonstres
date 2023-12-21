package jeu;

public class main {

	public static void main(String[] args) {
		
		Lutin lutin = new Lutin();
		Chevalier chev = new Chevalier();
		
		chev.gifle(lutin);
		
		int sante = lutin.getSante();
		System.out.print(sante);
		
		
		
		}

}
