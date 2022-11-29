package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Musee;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 12);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
//		panoramix.parler("Je vais aller préparer une petite potion...");
//		panoramix.preparerPotion();
//		panoramix.booster(obelix);
//		panoramix.booster(asterix);
//		asterix.parler("Bonjour à tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		System.out.println("Erreur : force négative");
		Musee musee = new Musee();
		asterix.faireUneDonation(musee);
		musee.extraireInstructionsCaml();
	}
}
