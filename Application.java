import java.util.Scanner;

public class Application {
    public static void menuPr(){
        System.out.println("1. Gestion Apprenant");
        System.out.println("2.Gestion Formateur");
        System.out.println("3.Gostion Classe");

    }
    public static void main(String[] args){

        int choix=0;
        do {
            System.out.println("Enter choix: ");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix){
                case 1:
                    menuPr();
                    break;
            }

        }while (choix !=2);

    }
}
