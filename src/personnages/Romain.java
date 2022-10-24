package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	
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


//	public void recevoirCoup(int forceCoup, Romain romain) {
//		assert romain.force>=0;
//		int temp = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert temp<force;
//	}

	public int getForce() {
		return force;
	}
	
	public void sEquiper(Equipement equipement, Romain romain) {
		switch (nbEquipement) {
			case 2 :
				System.out.println("Le soldat " + romain.nom + " est d�j� bien prot�g� !");
				break;
			case 1:
				if (romain.equipement[0] == equipement) {
					System.out.println("Le soldat " + romain.nom + " poss�de d�j� un " + equipement +" !");
				} else {
					romain.equipement[1] = equipement;
					System.out.println("Le soldat " + romain.nom + " s'�quipe avec un " + equipement +".");
					nbEquipement += 1;
				}
				break;
			default :
				romain.equipement[0] = equipement;
				System.out.println("Le soldat " + romain.nom + " s'�quipe avec un " + equipement +".");
				nbEquipement += 1;
		}
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		
		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		} else {
//			equipementEjecte = ejecterEquipement();
//			parler("J'abandonne...");
//		}
		if (force == 0) {
			parler("A�e");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force � diminuer
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}



	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		assert minus.force>=0;
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE,minus);
		minus.sEquiper(Equipement.CASQUE,minus);
		minus.sEquiper(Equipement.BOUCLIER,minus);
		minus.sEquiper(Equipement.BOUCLIER,minus);
	}
}
