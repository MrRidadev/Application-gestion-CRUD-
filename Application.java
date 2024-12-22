import java.util.Scanner;

public class Application {

    static void menuPrincipal() {
        System.out.println("1. Gestion Apprenant");
        System.out.println("2. Gestion Formateur");
        System.out.println("3. Gestion Classe");
        System.out.println("4. Quitter");
    }

    static void menuOptions() {
        System.out.println("1. Ajouter");
        System.out.println("2. Modifier");
        System.out.println("3. Supprimer");
        System.out.println("4. Afficher");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choixPrincipal;

        do {
            // Afficher le menu principal
            menuPrincipal();
            System.out.print("Entrez votre choix: ");
            choixPrincipal = scanner.nextInt();

            if (choixPrincipal >= 1 && choixPrincipal <= 3) {
                // Afficher les options secondaires
                menuOptions();
                System.out.print("Entrez votre choix dans le menu des options: ");
                int choixOption = scanner.nextInt();

                switch (choixPrincipal) {
                    case 1: // Gestion Apprenant
                        gererApprenant(choixOption);
                        break;

                    case 2: // Gestion Formateur
                        gererFormateur(choixOption);
                        break;

                    case 3: // Gestion Classe
                        System.out.println("Gestion des classes non implémentée.");
                        break;

                    default:
                        break;
                }
            } else if (choixPrincipal == 4) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide !");
            }
        } while (choixPrincipal != 4);

        scanner.close();
    }

    static void gererApprenant(int choixOption) {
        switch (choixOption) {
            case 1:
                System.out.println("Ajouter Apprenant.");
                Apprenant.AjouterApprenant();
                break;

            case 2:
                System.out.println("Modifier Apprenant.");
                Apprenant.ModifierApprenant();
                break;

            case 3:
                System.out.println("Supprimer Apprenant.");
                Apprenant.SuprimierApprenant();
                break;

            case 4:
                System.out.println("Afficher Apprenant.");
                Apprenant.AffichierApprenant();
                break;

            default:
                System.out.println("Option invalide !");
                break;
        }
    }
    static void gererFormateur(int choixOption) {
        switch (choixOption) {
            case 1:
                System.out.println("Ajouter Formateur.");
                Formateur.AjouterFormateur();
                break;

            case 2:
                System.out.println("Modifier Formateur.");
                Formateur.ModifierFormateur();

                break;

            case 3:
                System.out.println("Supprimer Formateur.");
                Formateur.SuprimierFormateur();

                break;

            case 4:
                System.out.println("Afficher Formateur.");
                Formateur.AffichierFormateur();

                break;

            default:
                System.out.println("Option invalide !");
                break;
        }
    }



}
