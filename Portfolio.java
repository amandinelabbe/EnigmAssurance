import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String nom;
    private List<Produit> produits;

    public Portfolio(String nom) { /* création de 2 variables */
        this.nom = nom;
        this.produits = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterProduit(Produit produit) { /* ajoute un nouveau produit à la liste "produits"*/
        produits.add(produit);
    }

    public void supprimerProduit(int index) { /*supprime un produit de la liste en fonction de son index */
        produits.remove(index);
    }

    public double getValeurLiquidative() { /*calcule et retourne la valeur totale de tous les produits du portefeuille*/
        double valeurLiquidative = 0;
        for (Produit produit : produits) {
            valeurLiquidative += produit.getValeurLiquidative();
        }
        return valeurLiquidative;
    }

    @Override
    public String toString() { /* retourne une chaîne de caractères du portefeuille (son nom, la liste de ses produits et la valeur totale du portefeuille) */
        StringBuilder sb = new StringBuilder();
        sb.append("\nPortfolio ").append(nom).append(" :\n");
        for (Produit produit : produits) {
            sb.append("- ").append(produit.toString()).append("\n");
        }
        sb.append("\nValeur du portefeuille : ").append(getValeurLiquidative());
        return sb.toString();
    }
}
