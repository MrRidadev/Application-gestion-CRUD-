public class Apprenant extends Personne{
    private double note;
    private int telephone;

    public Apprenant(int id , String nom, String prenom, String email, double note,int telephone){
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
}

