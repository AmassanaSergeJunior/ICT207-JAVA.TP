package repositorie.Choisir;

import models.Choisir;

import java.util.List;

public interface ChoirRepositorie {
    void saveChoisirs(Choisir... choisirs);

    List<Choisir> getChoisirs();

    void updateChoisirs(Choisir... choisirs);

    Choisir getChoirById(String idChoir);
}
