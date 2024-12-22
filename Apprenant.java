import java.util.Scanner;
import java.util.ArrayList;
public class Apprenant extends Personne{
    private double note;
    private static int id;
    private int telephone;
    Classe classe;
    static  Scanner sc = new Scanner(System.in);
    private static ArrayList<Apprenant> apprenants = new ArrayList<>();


    public Apprenant(int id,String nom, String prenom, String email, double note, int telephone, Classe classe) {
        super(id,nom, prenom, email);
        this.note = note;
        this.telephone = telephone;
        this.classe = classe;
    }

    public Apprenant(int id,String nom, String prenom, String email, int telephone, double note, Classe classe){
        super(id,nom,prenom,email);
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

    public  int getId() {
        return id;
    }



    public  void setId(int id) {
        Apprenant.id = id;
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email +
                ", note=" + note +
                ", telephone=" + telephone +
                ", classe=" + classe +
                '\'' +
                '}';
    }

    static void AjouterApprenant(){
        id = apprenants.size()+1;
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
        Apprenant ap = new Apprenant(id,nom,prenom,email,note,telephone,classe);
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
public static Apprenant rechercheId(int idrecherrche){

        for(Apprenant apprenant : apprenants){
            if(apprenant.getId()==idrecherrche){
                return apprenant;
            }


        }
    return null;
}
    public static   void ModifierApprenant() {
        System.out.print("ID de l'apprenant à modifier: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
                System.out.print("Nouveau Nom: ");
                apprenant.setNom(sc.nextLine());
                System.out.print("Nouveau Prénom: ");
                apprenant.setPrenom(sc.nextLine());
                System.out.print("Nouvel Email: ");
                apprenant.setEmail(sc.nextLine());

                System.out.print("Nouvelle Classe: ");
                String classenom = sc.nextLine();
                Classe classe = rechrcheClasse(classenom);
//                if (classe == null) {
//                    System.out.println("Classe introuvable !");
//                    return;
//                }
                apprenant.setClasse(classe);
                System.out.println("Apprenant modifié !");
                return;
            }
        }
        System.out.println("Apprenant introuvable !");
    }

    static void SuprimierApprenant(){
        System.out.println("entre id pour supprimier Apprenant !!");
        int id = sc.nextInt();
        sc.nextLine();
        Apprenant apprenantSupprimier = null;
        for (Apprenant apprenant : apprenants){
            apprenantSupprimier = apprenant;
            break;
        }
        if (apprenantSupprimier == null){
            System.out.println("no apprenant pour cette id "+id);
            return;
        }
        apprenants.remove(apprenantSupprimier);
        System.out.println("Apprenant supprimier avec succees");

    }








}

