import java.util.Scanner;
import java.util.ArrayList;
public class Apprenant extends Personne{
    private double note;
    private int telephone;
    Classe classe;

    private static ArrayList<Apprenant> apprenants = new ArrayList<>();


    public Apprenant(String nom, String prenom, String email, double note, int telephone, Classe classe) {
        super(nom, prenom, email);
        this.note = note;
        this.telephone = telephone;
        this.classe = classe;
    }

    public Apprenant(String nom, String prenom, String email, int telephone, double note, Classe classe){
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email +
                "note=" + note +
                ", telephone=" + telephone +
                ", classe=" + classe +
                '\'' +
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
        sc.nextLine();
        System.out.println("Enter classe name ");
        String nomclasse = sc.nextLine();
        Classe classe = rechrcheClasse(nomclasse);
//        if(classe==null){
//            System.out.println("crée b'abord classe");
//        }
        Apprenant ap = new Apprenant(nom,prenom,email,note,telephone,classe);
        apprenants.add(ap);
        System.out.println();


}
public static Classe rechrcheClasse(String nom){
        for (Classe classe : Classe.classes){
            if (classe.getNom().equals(nom)){
                return classe;
            }
        }
    return null;
}

    static void AffichierApprenant() {
        if (apprenants.isEmpty()) {
            System.out.println("Aucun apprenant à afficher !");
        } else {
            System.out.println("Liste des apprenants :");
//            for (int i = 0; i < apprenants.size(); i++) {
//                System.out.println((i + 1) + ". " + apprenants.get(i));
//            }
            for(Apprenant ap : apprenants){
                System.out.println(ap);

            }
        }
    }
static void ModifierApprenant(){

}
static void SuprimierApprenant(){

}








}

