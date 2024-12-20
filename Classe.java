import java.util.ArrayList;

public class Classe {
    private String nom ;
    private String formateur ;
    public static ArrayList<Classe> classes = new ArrayList<>();
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nom='" + nom + '\'' +
                ", formateur='" + formateur + '\'' +
                '}';
    }

}
