import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    private String specialite ;
    private double salaire;
    private static ArrayList<Formateur> formateurs = new ArrayList<>();
public Formateur( int id , String nom, String prenom, String email, String specialite,double salaire){
    super(id,nom, prenom, email);
    this.specialite = specialite;
    this.salaire = salaire;
}
    public String getSpecialite(){
        return specialite;
    }
    public double getSalaire(){
        return salaire;
    }
    public void setSpecialite(String specialite){
    this.specialite=specialite;
    }
    public void setSalaire(double salaire){
    this.salaire=salaire;
    }

    @Override
    public String toString() {
        return "Formateur{" +

                " id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                '}';
    }
    static void AjouterFormateur(){
        int id = formateurs.size()+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nom de Formateur : ");
        String nom = sc.nextLine();
        System.out.println("Enter prenom de Formateur : ");
        String prenom= sc.nextLine();
        System.out.println("Enter email(@gmail.com) de Formateur : ");
        String email = sc.nextLine();
        System.out.println("Enter specialite de Formateur : ");
        String specialite = sc.nextLine();
        System.out.println("Enter salaire de Formateur : ");
        double salaire = sc.nextDouble();

        Formateur form = new Formateur(id, nom, prenom,email,specialite,salaire);
        formateurs.add(form);
        System.out.println();
    }

    static void AffichierFormateur() {
        if (formateurs.isEmpty()) {
            System.out.println("Aucun Formateur à afficher !");
        } else {
            System.out.println("Liste des Formateurs :");
//            for (int i = 0; i < formateurs.size(); i++) {
//                System.out.println((i + 1) + ". " + formateurs.get(i));
//            }
            for(Formateur form : formateurs){
                System.out.println(form);

            }
        }
    }
    public static Classe rechrcheClasse(String nom){
        for (Classe classe : Classe.classes){
            if (classe.getNom().equals(nom)){
                return classe;
            }
        }
        return null;
    }
    public static void ModifierFormateur() {
    Scanner sc = new Scanner(System.in);

        System.out.print("ID de l'apprenant à modifier: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Formateur formateur : formateurs) {
            if (formateur.getId() == id) {
                System.out.print("Nouveau Nom: ");
                formateur.setNom(sc.nextLine());
                System.out.print("Nouveau Prénom: ");
                formateur.setPrenom(sc.nextLine());
                System.out.print("Nouvel Email: ");
                formateur.setEmail(sc.nextLine());

                System.out.print("Nouvelle Classe: ");
                String classenom = sc.nextLine();
                System.out.println("Enter Nouvelle salaire de Formateur : ");
                double salaire = sc.nextDouble();
                Classe classe = rechrcheClasse(classenom);
//                if (classe == null) {
//                    System.out.println("Classe introuvable !");
//                    return;
//                }
                formateur.setClasse(classe);
                System.out.println("Formateur modifié !");
                return;
            }
        }
        System.out.println("Formateur introuvable !");
    }


    static void SuprimierFormateur(){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre id pour supprimier Formateur !!");
        int id = sc.nextInt();
        sc.nextLine();
        Formateur formateurSupprimier = null;
        for (Formateur formateur : formateurs){
            formateurSupprimier = formateur;
            break;
        }
        if (formateurSupprimier == null){
            System.out.println("no Formateur pour cette id "+id);
            return;
        }
        formateurs.remove(formateurSupprimier);
        System.out.println("Formateur supprimier avec succees");

    }

    private void setClasse(Classe classe) {
    }

}
