public class Apprenant extends Personne{
    double note;

    public Apprenant(int id , String nom, String prenom, String email, double note){
        super(nom,prenom,email);
        this.note = note;

    }
    public double getNote(){
        return note;
    }
    public void setNote(double note){
        this.note=note;
    }

}

