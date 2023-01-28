package repositorie.Choisir;

import database.Choisirpost;
import models.Choisir;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChoirRepositorieImpl implements ChoirRepositorie {

    private Connection connection;

    public void ChoirRepositorieImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveChoisirs(Choisir... choisirs) {
        for (Choisir chois : choisirs) {
            saveOneChoisir(chois);
        }
    }

    @Override
    public List<Choisir> getChoisirs() {
        ArrayList<Choisir> choisirs = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + Choisirpost.TABLE_NAME);
            while (resultSet.next()) {
                Choisir choisir = extractChoisir(resultSet);
                if (choisir != null) {
                    choisirs.add(choisir);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return choisirs;
    }

    @Override
    public void updateChoisirs(Choisir... choisirs) {

    }

    @Override
    public Choisir getChoirById(String idChoir) {
        return null;
    }

    private void saveOneChoisir(Choisir choisir) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " + Choisirpost.TABLE_NAME + " ( " + Choisirpost.ID_ENSEIGNANT_FIELD_NAME + "," + Choisirpost.ID_JOUR_FIELD_NAME + " ) VALUES (?, ? )");
            statement.setString(1,choisir.getId_enseignant());
            statement.setString(2,choisir.getId_jour());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private Choisir extractChoisir(ResultSet resultSet) {
        try {
            String idEnse = resultSet.getString(Choisirpost.ID_ENSEIGNANT_FIELD_NAME);
            String idJour = resultSet.getString(Choisirpost.ID_JOUR_FIELD_NAME);
            return new Choisir(idEnse, idJour);
        } catch (SQLException e) {
            return null;
        }
    }
}
