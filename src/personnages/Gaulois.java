package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

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

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
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