package repositorie.Horaire;

import models.Choisir;
import models.Horaire;

import java.util.List;

public interface HoraireRepositorie {
    void saveHoraires(Horaire... horaires);

    List<Horaire> getHoraires();

    void updateHoraires(Horaire... horaires);

    Choisir getHoraireById(String idHoraire);
}
