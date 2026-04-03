package partie1;
public class ComptBancaire {

    private int    numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;
    private static int    nbComptes         = 0;
    private static double tauxInteretAnnuel = 0.03;
    private static int    compteurNumero    = 1000;

    public ComptBancaire() {
        this.numero            = ++compteurNumero;
        this.titulaire         = "Inconnu";
        this.solde             = 0.0;
        this.decouvertAutorise = 0.0;
        nbComptes++;
    }

    public ComptBancaire(String titulaire, double soldeInitial, double decouvertAutorise) {
        this.numero = ++compteurNumero;
        setTitulaire(titulaire);
        this.solde = soldeInitial;
        setDecouvertAutorise(decouvertAutorise);
        nbComptes++;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire == null || titulaire.trim().isEmpty()) {
            System.out.println("Erreur : le nom du titulaire ne peut pas être vide.");
        } else {
            this.titulaire = titulaire;
        }
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise < 0) {
            System.out.println("Erreur : le découvert autorisé ne peut pas être négatif.");
        } else {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        if (taux < 0) {
            System.out.println("Erreur : le taux ne peut pas être négatif.");
        } else {
            tauxInteretAnnuel = taux;
        }
    }
    public void afficher() {
        System.out.println("          COMPTE BANCAIRE               ");
        System.out.printf ("  Numero          : %d%n",      numero);
        System.out.printf ("  Titulaire       : %s%n",      titulaire);
        System.out.printf ("  Solde           : %.2f MAD%n", solde);
        System.out.printf ("  Decouvert auto. : %.2f MAD%n", decouvertAutorise);
    }
    public void deposer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant de depot invalide.");
        } else {
            solde += montant;
            System.out.printf("Depot de %.2f MAD effectue. Nouveau solde : %.2f MAD%n", montant, solde);
        }
    }
    public void retirer(double montant) {
        if (montant <= 0 || montant > solde + decouvertAutorise) {
            System.out.println("Retrait refuse.");
        } else {
            solde -= montant;
            System.out.printf("Retrait de %.2f MAD effectue. Nouveau solde : %.2f MAD%n", montant, solde);
        }
    }
    public void virementVers(ComptBancaire autre, double montant) {
        if (montant <= 0 || montant > solde + decouvertAutorise) {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        } else {
            this.solde  -= montant;
            autre.solde += montant;
            System.out.printf("Virement de %.2f MAD du compte %d vers compte %d effectue.%n",
                              montant, this.numero, autre.numero);
        }
    }
    public double calculerSoldeAvecInterets() {
        return solde * (1 + tauxInteretAnnuel);
    }
    public double calculerSoldeAvecInterets(double bonus) {
        return solde * (1 + tauxInteretAnnuel + bonus);
    }
    public static void main(String[] args) {
        System.out.println("=== Creation des comptes ===\n");
        ComptBancaire c0 = new ComptBancaire();
        c0.afficher();
        ComptBancaire c1 = new ComptBancaire("Youssef Alami", 1000.0, 500.0);
        ComptBancaire c2 = new ComptBancaire("Sara Benali",    500.0, 200.0);
        c1.afficher();
        c2.afficher();
        System.out.println("Nombre total de comptes : " + ComptBancaire.getNbComptes());
        System.out.println("\n Depots ");
        c1.deposer(300);
        c1.deposer(-50);
        System.out.println("\n Retraits ");
        c1.retirer(1200);   
        c1.retirer(1600);   
        System.out.println("\n Virement ");
        c2.virementVers(c1, 200);
        System.out.println("\n Interets ");
        System.out.printf("Taux annuel : %.0f%%%n", tauxInteretAnnuel * 100);
        System.out.printf("Solde c1 avec interets (3%%)       : %.2f MAD%n",
                          c1.calculerSoldeAvecInterets());
        System.out.printf("Solde c1 avec interets (3%%+2%%)   : %.2f MAD%n",
                          c1.calculerSoldeAvecInterets(0.02));
        System.out.println("\n Changement du taux ");
        ComptBancaire.setTauxInteretAnnuel(0.05);
        System.out.printf("Nouveau taux : %.0f%%%n", ComptBancaire.getTauxInteretAnnuel() * 100);
        System.out.printf("Solde c1 recalcule : %.2f MAD%n", c1.calculerSoldeAvecInterets());
        System.out.println("\n Validations ");
        c1.setTitulaire("");
        c1.setDecouvertAutorise(-100);
        System.out.println("\n Etat final");
        c1.afficher();
        c2.afficher();
    }
}
