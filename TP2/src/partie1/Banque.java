package partie1;
public class Banque {    
    private String           nom;
    private ComptBancaire[] comptes;
    private int              nbActuels;
    public Banque(String nom, int capaciteMax) {
        this.nom       = nom;
        this.comptes   = new ComptBancaire[capaciteMax];
        this.nbActuels = 0;
    }
    public void ajouterCompte(ComptBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
            System.out.println("Compte de " + c.getTitulaire() + " ajouté avec succès.");
        } else {
            System.out.println("Impossible d'ajouter : la banque est pleine.");
        }
    }
    public void afficherTous() {   
        System.out.println("  BANQUE : " + nom);
        System.out.println("  Nombre de comptes : " + nbActuels);        
        if (nbActuels == 0) {
            System.out.println("  Aucun compte enregistré.");
        } else {
            for (int i = 0; i < nbActuels; i++) {
                comptes[i].afficher();
            }
        }
    }
    public static void main(String[] args) {      
        Banque banque = new Banque("Banque Al Maghrib", 3);     
        ComptBancaire c1 = new ComptBancaire("Youssef Alami", 1000.0, 500.0);
        ComptBancaire c2 = new ComptBancaire("Sara Benali",    500.0, 200.0);
        ComptBancaire c3 = new ComptBancaire("Karim Tazi",    1500.0, 300.0);
        ComptBancaire c4 = new ComptBancaire("Nadia Idrissi",  800.0, 100.0);
        System.out.println("=== Ajout des comptes ===");
        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);
        banque.ajouterCompte(c3);
        banque.ajouterCompte(c4); 
        System.out.println("\n=== Affichage de tous les comptes ===");
        banque.afficherTous();
    }
}
