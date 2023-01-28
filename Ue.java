package models;

public class Ue {
    private String Id_ue;
    private  String Nom_ue;
    private  String Id_enseignant;

    public Ue(String id_ue, String Nom_ue, String id_enseignant) {
        Id_ue = id_ue;
        Nom_ue = Nom_ue;
        Id_enseignant = id_enseignant;
    }

    public String getId_ue() {
        return Id_ue;
    }

    public void setId_ue(String id_ue) {
        Id_ue = id_ue;
    }

    public String getNom_ue() {
        return Nom_ue;
    }

    public void setNom_ue(String Nom_ue) {
        Nom_ue = Nom_ue;
    }

    public String getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(String id_enseignant) {
        Id_enseignant = id_enseignant;
    }


}
