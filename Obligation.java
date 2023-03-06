public class Obligation extends Produit { /* création de 2 variables */
    private double tauxInteret;
    private int duree;

    public Obligation(String nom, double tauxInteret, int duree) {
        super(nom, 0);
        this.tauxInteret = tauxInteret;
        this.duree = duree;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public double getValeurLiquidative() { /*méthode qui retourne le prix du portefeuille grâce à la formule*/
        return getValeurMarchande() * (1 + tauxInteret * duree);
    }

    @Override
    public String toString() {
        return "Obligation " + getNom() + " (taux d'intérêt : " + tauxInteret + ", durée : " + duree + " ans)";
    }
}