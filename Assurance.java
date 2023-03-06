import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assurance { /*classe qui gère le contenu pour l'utilisateur */
    public static void main(String[] args) {

    List<Portfolio> portfolios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n******************************************************************");
    System.out.println("*********************** ENIGMA ASSURANCE *************************");
    System.out.println("******************************************************************\n");

        while (true) {
            System.out.println("\nQue voulez-vous faire ?\n");
            System.out.println("1. Créer un portefeuille");
            System.out.println("2. Modifier un portefeuille");
            System.out.println("3. Afficher tous les portefeuilles");
            System.out.println("4. Quitter\n");
            System.out.println("\nEntrez le numéro de votre choix :");

            int choix = scanner.nextInt(); /*on crée des choix pour que l'utilisateur se repère facilement */

            if (choix == 1) { /*en fonction de ce que l'utilisateur a entré il va y avoir différentes actions */
                System.out.println("\nVeuillez entrer le nom du portefeuille :");
                String nom = scanner.next();
                Portfolio portfolio = new Portfolio(nom); /*création nouveau portfeuille */
                portfolios.add(portfolio);
                System.out.println("Le portefeuille " + nom + " a été créé.");
            } else if (choix == 2) {
                System.out.println("Veuillez entrer le numéro du portefeuille à modifier :");
                for (int i = 0; i < portfolios.size(); i++) {
                    System.out.println(i + 1 + ". " + portfolios.get(i).getNom()); /*modification du portfeuille */
                }
                int index = scanner.nextInt() - 1;
                if (index < 0 || index >= portfolios.size()) {
                    System.out.println("Numéro de portefeuille invalide.");
                    continue;
                }
                Portfolio portfolio = portfolios.get(index);
                while (true) {
                    System.out.println("\nQue voulez-vous faire avec le portefeuille " + portfolio.getNom() + " ?");
                    System.out.println("1. Ajouter une action");
                    System.out.println("2. Ajouter une obligation");
                    System.out.println("3. Supprimer un produit");
                    System.out.println("4. Retour\n");

                    int choix2 = scanner.nextInt();

                    if (choix2 == 1) { /*création d'une action avec toutes ses infos */
                        System.out.println("\nVeuillez entrer le nom de l'action :");
                        String nom = scanner.next();
                        System.out.println("\nVeuillez entrer le prix d'achat de l'action :");
                        double prix = scanner.nextDouble();
                        System.out.println("\nVeuillez entrer le nombre d'actions :");
                        int quantite = scanner.nextInt();
                        Action action = new Action(nom, prix, quantite);
                        portfolio.ajouterProduit(action);
                        System.out.println("\nL'action " + nom + " a été ajoutée au portefeuille " + portfolio.getNom() + ".");
                    } else if (choix2 == 2) { /*création d'une obligation avec toutes ses infos */
                        System.out.println("\nVeuillez entrer le nom de l'obligation :");
                        String nom = scanner.next();
                        System.out.println("\nVeuillez entrer le taux d'intérêt de l'obligation :");
                        double tauxInteret = scanner.nextDouble();
                        System.out.println("\nVeuillez entrer la durée de l'obligation en années :");
                        double duree = scanner.nextDouble();
                        
                        System.out.println("\nL'obligation " + nom + " a été ajoutée au portefeuille " + portfolio.getNom() + ".");
                    } else if (choix2 == 3) {
                    
                        System.out.println("\nLe produit a été supprimé du portefeuille " + portfolio.getNom() + ".");
                    } else if (choix2 == 4) {
                        break;
                    } else {
                        System.out.println("Choix invalide.");
                    }
                }
            } else if (choix == 3) {
                for (Portfolio portfolio : portfolios) {
                    System.out.println(portfolio.toString()); /*affiche les portfeuilles */
                }
            } else if (choix == 4) {
                break; /*quitte le programme avec un break*/
            } else {
                System.out.println("Choix invalide.");
            }
        }
    }
}

