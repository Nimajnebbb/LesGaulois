package personnages;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " » ");
	}

//	public String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion,romain);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(Gaulois gaulois, int forcePotion) {
		effetPotion = forcePotion;
		gaulois.parler(" Merci Druide, je sens que ma force est "+ forcePotion +" fois décuplée.");
	}

	public static void main(String[] args) {
		// Gaulois asterix = new Gaulois("Astérix", 4);
		// Romain cesar = new Romain("César", 1);
//		System.out.println(asterix.nom);
//		System.out.println(asterix);
//		System.out.println(asterix.prendreParole());
//		asterix.parler("je parle.");
//		System.out.println(cesar.prendreParole());
//		asterix.frapper(cesar);
		// asterix.boirePotion(asterix,8);
	}

}
