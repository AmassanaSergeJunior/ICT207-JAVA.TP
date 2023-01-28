package models;

public class Selectionner {
    private String Id_enseignant;
    private  String Id_horaire;

    public Selectionner(String id_enseignant, String id_horaire) {
        Id_enseignant = id_enseignant;
        Id_horaire = id_horaire;
    }

    public String getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(String id_enseignant) {
        Id_enseignant = id_enseignant;
    }

    public String getId_horaire() {
        return Id_horaire;
    }

    public void setId_horaire(String id_horaire) {
        Id_horaire = id_horaire;
    }
}
