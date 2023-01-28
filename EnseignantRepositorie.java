package repositorie.Enseignant;

import database.Enseignantpost;
import models.Enseignant;

import java.util.List;

public interface EnseignantRepositorie {


    void saveEnseignants(Enseignant... enseignants);

    List<Enseignant> getEnseignantById();

    void updateEnseignants(Enseignant... enseignants);

    Enseignantpost getEnseignantById(String idEnseignant);
}
