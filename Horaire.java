package models;

public class Horaire {
    private String Id_horaire;
    private  String Heure_debut;
    private  String Heure_fin;

    public Horaire(String id_horaire, String heure_debut, String heure_fin) {
        Id_horaire = id_horaire;
        Heure_debut = Heure_debut;
        Heure_fin = Heure_fin;
    }

    public String getId_horaire() {
        return Id_horaire;
    }

    public void setId_horaire(String id_horaire) {
        Id_horaire = id_horaire;
    }

    public String getHeure_debut() {
        return Heure_debut;
    }

    public void setHeure_debut(String Heure_debut) {
        Heure_debut = Heure_debut;
    }
    public String getHeure_fin() {
        return Heure_fin;
    }

    public void setHeure_fin(String Heure_fin) {
        Heure_fin = Heure_fin;
    }

}
