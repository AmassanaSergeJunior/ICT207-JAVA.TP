package models;

public class Enseignant {
    private String idEnseig;
    private String nomEnseig;
    private String grade;
    private String telephone;

    public Enseignant( String idEnseig,String nomEnseig, String grade, String telephone) {

        this.idEnseig= idEnseig;
        this.nomEnseig = nomEnseig;
        this.grade = grade;
        this.telephone = telephone;
    }

    public String getIdEnseig(){
        return idEnseig;
    }
    public void setIdEnseig( String idEnseig){
       this.idEnseig=idEnseig;
    }
    public String getNomEnseig() {
        return nomEnseig;
    }

    public void setNomEnseig(String nomEnseig) {
        this.nomEnseig = nomEnseig;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
