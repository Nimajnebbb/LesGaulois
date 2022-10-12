package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}


	public void recevoirCoup(int forceCoup, Romain romain) {
		assert romain.force>=0;
		int temp = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert temp<force;
	}

	public int getForce() {
		return force;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		assert minus.force>=0;
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
}
