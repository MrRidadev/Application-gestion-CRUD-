import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    private String specialite ;
    private double salaire;
    private static int id;
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
        id = formateurs.size()+1;
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

}
