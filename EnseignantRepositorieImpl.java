package repositorie.Enseignant;

import database.Enseignantpost;
import models.Enseignant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnseignantRepositorieImpl implements EnseignantRepositorie{
    private Connection connection;

    public void EnseignantRepositorieImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveEnseignants(Enseignant... enseignants) {
        for (Enseignant enseign : enseignants) {
            saveOneEnseignants(enseign);
        }
    }

    @Override
    public List<Enseignant> getEnseignantById() {
        ArrayList<Enseignant> enseignants = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + Enseignantpost.TABLE_NAME);
            while (resultSet.next()) {
                Enseignant enseignant = extractEnseignant(resultSet);
                if (enseignant != null) {
                    enseignants.add(enseignant);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return enseignants;
    }

    @Override
    public void updateEnseignants(Enseignant... enseignants) {

    }

    @Override
    public Enseignantpost getEnseignantById(String idEnseignant) {
        return null;
    }

    private void saveOneEnseignants(Enseignant enseignant) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " + Enseignantpost.TABLE_NAME + " ( " + Enseignantpost.ID_ENSEIGNANT_FIELD_NAME + "," + Enseignantpost.NAME_ENSEIGNANT_FIELD_NAME +","+ Enseignantpost.GRADE_ENSEIGNANT_FIELD_NAME +","+Enseignantpost.TELEPHONE_ENSEIGNANT+ " ) VALUES (?, ? ,? ,?)");
            statement.setString(1,enseignant.getIdEnseig());
            statement.setString(2,enseignant.getNomEnseig());
            statement.setString(3,enseignant.getGrade());
            statement.setString(4,enseignant.getTelephone());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private Enseignant extractEnseignant(ResultSet resultSet) {
        try {
            String idEnse = resultSet.getString(Enseignantpost.ID_ENSEIGNANT_FIELD_NAME);
            String nomEnse = resultSet.getString(Enseignantpost.NAME_ENSEIGNANT_FIELD_NAME);
            String gradeEnse = resultSet.getString(Enseignantpost.GRADE_ENSEIGNANT_FIELD_NAME);
            String teleEnse = resultSet.getString(Enseignantpost.TELEPHONE_ENSEIGNANT);

            return new Enseignant(idEnse, nomEnse, gradeEnse , teleEnse);
        } catch (SQLException e) {
            return null;
        }
    }
}
