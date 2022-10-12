package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois [nbVillageoisMaximum];
    }
    public void setChef(Chef chef) {
        this.chef = chef;
    }
    public String getNom() {
        return nom;
    }

    public void ajouterHabitant(Gaulois gaulois){
        villageois[nbVillageois] = gaulois;
        nbVillageois += 1;
    }

    public Gaulois trouverHabitant(int numVillageois) {
        return villageois[numVillageois];
    }

    public void afficherVillageois() {
        System.out.println("Dans village du chef " + chef + " vivent les légendaires gaulois :");
        for (int i=0;i<nbVillageois;i++) {
            String nom = getNom(villageois[i]);
            System.out.println("- " + villageois[i]);
        }
    }

    public static void main(String[] args) {
        Village village = new Village("Village des irréductibles", 30);
        // Gaulois gaulois = village.trouverHabitant(30);
        // Remove this useless assignment to local variable "gaulois".
        Chef abraracourcix = new Chef("Abraracourcix", 6, village);
        village.setChef(abraracourcix);
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);
        // Gaulois gaulois = village.trouverHabitant(1);
        // System.out.println(gaulois); // on obtient "null"
        // On obtient ce résultat, car il n'y aucun villageois à l'indice 1 du tableau villageois
        village.afficherVillageois();
    }
}
