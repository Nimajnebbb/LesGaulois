package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une focre " + effetPotionMin + " à "
				+ "" + effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion(Druide druide) {
		Random random = new Random();
		while (forcePotion < 5) {
			forcePotion = random.nextInt(effetPotionMax);
		}
		if (forcePotion > 7) { 
			druide.parler("J'ai préparé une super potion de force "+forcePotion);
		} else { 
			druide.parler("Je n'ai pas trouvé tous les ingr�dients, ma potion est seulement de force "+forcePotion);
		}
	}

	public void booster(Druide druide,Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			druide.parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
		} else {
		gaulois.boirePotion(gaulois,forcePotion);
		}
	}
	
	public static void main(String[] args) {
		// Druide panoramix = new Druide("Panoramix",5,10);
		// System.out.println(panoramix.nom);
		// panoramix.preparerPotion(panoramix);
	}

}
