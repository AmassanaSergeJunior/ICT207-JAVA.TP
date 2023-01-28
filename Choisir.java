package models;

public class Choisir {
   private String Id_enseignant;
   private  String Id_jour;

    public Choisir(String id_enseignant, String id_jour) {
        Id_enseignant = id_enseignant;
        Id_jour = id_jour;
    }

    public String getId_enseignant() {
        return Id_enseignant;
    }

    public void setId_enseignant(String id_enseignant) {
        Id_enseignant = id_enseignant;
    }

    public String getId_jour() {
        return Id_jour;
    }

    public void setId_jour(String id_jour) {
        Id_jour = id_jour;
    }
}
