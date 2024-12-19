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

            switch (choixPrincipal) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Gestion choisie : " +
                            (choixPrincipal == 1 ? "Apprenant" :
                                    choixPrincipal == 2 ? "Formateur" : "Classe"));
                    // Afficher les options
                    menuOptions();
                    System.out.print("Entrez votre choix dans le menu des options: ");
                    int choixOption = scanner.nextInt();

                    switch (choixOption) {
                        case 1:
                            System.out.println("Ajouter Apprenant.");
                            Apprenant.AjouterApprenant();
                            break;
                        case 2:
                            System.out.println("Modifier choisi.");
                            break;
                        case 3:
                            System.out.println("Supprimer choisi.");
                            break;
                        case 4:
                            System.out.println("Afficher choisi.");
                            break;
                        default:
                            System.out.println("Option invalide !");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        } while (choixPrincipal != 4);

        scanner.close();
    }
}
