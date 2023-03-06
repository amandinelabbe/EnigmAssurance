public class Action extends Produit { /* création de 2 variables */
    private double prixAchat;
    private int quantite;
    
        public Action(String nom, double prixAchat, int quantite) {
            super(nom, prixAchat * quantite);
            this.prixAchat = prixAchat;
            this.quantite = quantite;
        }

        public double getPrixAchat() {
            return prixAchat;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) { /*méthode qui retourne la valeur marchande grâce au calcul */
            this.quantite = quantite;
            setValeurMarchande(prixAchat * quantite);
        }

        @Override
        public double getValeurLiquidative() {
            return getValeurMarchande();
        }

        @Override
        public String toString() {
            return "Action " + getNom() + " (prix d'achat : " + prixAchat + ", quantité : " + quantite + ")";
        }
}