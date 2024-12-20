import java.util.Scanner;
import java.util.ArrayList;
public class Apprenant extends Personne{
    private double note;
    private int telephone;

    private static ArrayList<Apprenant> apprenants = new ArrayList<>();


    public Apprenant( String nom, String prenom, String email, int telephone, double note){
        super(nom,prenom,email);
        this.note = note;
        this.telephone = telephone;

    }
    public double getNote(){
        return note;
    }
    public void setNote(double note){
        this.note=note;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }


    @Override
    public String toString() {
        return "Apprenant{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone=" + telephone +
                ", note=" + note +
                '}';
    }

    static void AjouterApprenant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nom de apprenant : ");
        String nom = sc.nextLine();
        System.out.println("Enter prenom de apprenant : ");
        String prenom= sc.nextLine();
        System.out.println("Enter email(@gmail.com) de apprenant : ");
        String email = sc.nextLine();
        System.out.println("Enter telephone de apprenant : ");
        int telephone = sc.nextInt();
        System.out.println("Enter note de apprenant : ");
        double note = sc.nextDouble();


}

    static void AffichierApprenant() {
        if (apprenants.isEmpty()) {
            System.out.println("Aucun apprenant à afficher !");
        } else {
            System.out.println("Liste des apprenants :");
            for (int i = 0; i < apprenants.size(); i++) {
                System.out.println((i + 1) + ". " + apprenants.get(i));
            }
        }
    }
static void ModifierApprenant(){

}
static void SuprimierApprenant(){

}








}

