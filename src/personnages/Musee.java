package personnages;

public class Musee {
	
	private Trophee[] trophees = new Trophee[30];
	private int nbTrophee;

	public Musee() {
		
	}
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		if (nbTrophee < 30) {
			trophees[nbTrophee] = new Trophee(gaulois, equipement);
			nbTrophee++;
//			System.out.println(nbTrophee);
//			for (Equipement trophees : Equipement.values()) {
//				System.out.println("- " + trophees);
//			}
		}
	}
	
	public void extraireInstructionsCaml() {
		String texte = "";
		for (int i = 0;i<nbTrophee;i++) {
			texte += "	" +(char)34+ trophees[i].donnerNom() +(char)34+ ", " +(char)34+ trophees[i].getEquipement() +(char)34+ ";\n";
		}
		System.out.println("let musee = [\n" +
				texte + "]");
	}

}
