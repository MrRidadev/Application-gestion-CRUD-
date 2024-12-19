import java.util.Scanner;

public class Formateur extends Personne {
    private String specialite ;
    private double salaire;

public Formateur( int id , String nom, String prenom, String email, String specialite,double salaire){
    super(nom, prenom, email);
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
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    static void AjouterFormateur(){
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
        System.out.println("Enter note de Formateur : ");
        double note = sc.nextDouble();

    }
}
