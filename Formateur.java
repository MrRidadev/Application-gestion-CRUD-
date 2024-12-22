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

                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                '}';
    }


}
