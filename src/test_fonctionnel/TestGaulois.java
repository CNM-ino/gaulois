package test_fonctionnel;

import personnage.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Astérix", 8);
		Gaulois oblx = new Gaulois("Obelix", 16);

		g.parler("Bonjour Obélix.");
		oblx.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		g.parler("Oui très bonne idée.");

	}
}
