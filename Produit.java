public abstract class Produit {
    private String nom;
    private double valeurMarchande;

    public Produit(String nom, double valeurMarchande) { /* création de 2 variables */
        this.nom = nom;
        this.valeurMarchande = valeurMarchande;
    }

    public String getNom() {
        return nom;
    }

    public double getValeurMarchande() {
        return valeurMarchande;
    }

    public void setValeurMarchande(double valeurMarchande) {
        this.valeurMarchande = valeurMarchande;
    }

    public abstract double getValeurLiquidative();
}