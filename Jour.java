package models;

public class Jour {
    private String Id_jour;
    private  String Nom_jour;

    public Jour(String id_jour, String Nom_jour) {
        Id_jour = id_jour;
        Nom_jour = Nom_jour;
    }

    public String getId_jour() {
        return Id_jour;
    }

    public void setId_jour(String id_jour) {
        Id_jour = id_jour;
    }

    public String getNom_jour() {
        return Nom_jour;
    }

    public void setNom_jour(String Nom_jour) {
        Nom_jour = Nom_jour;
    }
}
