package repositorie.Horaire;

import database.Choisirpost;
import database.Horairepost;
import models.Choisir;
import models.Horaire;
import repositorie.Choisir.ChoirRepositorie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class HoraireRepositorieImpl implements HoraireRepositorie {
    private Connection connection;

    public void HoraireRepositorieImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveHoraires(Horaire... horaires) {
        for (Horaire horaire : horaires) {
            saveOneHoraire(horaire);
        }
    }

    private void saveOneHoraire(Horaire horaire) {
    }

    @Override
    public List<Horaire> getHoraires() {
        ArrayList<Horaire> horaires = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + Horairepost.TABLE_NAME);
            while (resultSet.next()) {
                Horaire horaire = extractHoraire(resultSet);
                if (horaire != null) {
                    horaires.add(horaire);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return horaires;
    }

    private Horaire extractHoraire(ResultSet resultSet) {
    }

}
