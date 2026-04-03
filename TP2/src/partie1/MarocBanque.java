package partie1;

public class MarocBanque {

    public static void main(String[] args) {
        Banque marocBank = new Banque("MarocBank", 1500);
        System.out.println("Banque 'MarocBank' creee avec succes.\n");
        ComptBancaire c1 = new ComptBancaire("Youssef Alami", 2000.0, 500.0);
        ComptBancaire c2 = new ComptBancaire("Sara Benali",   1500.0, 300.0);
        ComptBancaire c3 = new ComptBancaire("Karim Tazi",     800.0, 200.0);
        System.out.println("=== Ajout des comptes ===");
        marocBank.ajouterCompte(c1);
        marocBank.ajouterCompte(c2);
        marocBank.ajouterCompte(c3);
        System.out.println("\n=== Operations sur c1 (Youssef Alami) ===");
        c1.deposer(500.0);      
        c1.retirer(300.0);       
        c1.retirer(5000.0);      

        System.out.println("\n=== Virement de c2 (Sara) vers c3 (Karim) ===");
        c2.virementVers(c3, 400.0);  
        c2.virementVers(c3, 9999.0); 

        System.out.println("\n=== Affichage de tous les comptes ===");
        marocBank.afficherTous();

        System.out.println("=== Calcul des interets sur c2 (Sara Benali) ===");
        System.out.printf("  Solde actuel de c2                   : %.2f MAD%n",
                          c2.getSolde());
        System.out.printf("  Solde avec interets (taux 3%%)       : %.2f MAD%n",
                          c2.calculerSoldeAvecInterets());
        System.out.printf("  Solde avec interets (taux 3%%+1.5%%): %.2f MAD%n",
                          c2.calculerSoldeAvecInterets(0.015));
        System.out.println("\n=== Statistiques globales ===");
        System.out.println("  Nombre total de comptes crees : "
                           + ComptBancaire.getNbComptes());
        System.out.printf ("  Taux d'interet annuel         : %.0f%%%n",
                           ComptBancaire.getTauxInteretAnnuel() * 100);
    }
}