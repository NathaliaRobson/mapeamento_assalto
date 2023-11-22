package dao;

import config.ConnectionPoolConfig;
import model.Cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroDao {

    public void createCadastro(Cadastro cadastro){
        String SQL = "INSERT INTO CADASTRO (CAD_USERNAME, CAD_EMAIL, CAD_PASSWORD, CAD_PASSWORDCONF) VALUES(?,?,?,?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            //Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            //System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,cadastro.getUsername());
            preparedStatement.setString(2,cadastro.getEmail());
            preparedStatement.setString(3,cadastro.getPassword());
            preparedStatement.setString(4,cadastro.getPasswordConf());

            preparedStatement.execute();

            System.out.println("success in insert cadastro");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public List<Cadastro> findAllCadastro() {

        String SQL = "SELECT * FROM CADASTRO";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            //Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            //System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cadastro> cadastros = new ArrayList<>();

            while (resultSet.next()) {
                String cadId = resultSet.getString("cad_id");
                String cadUserName = resultSet.getString("cad_username");
                String cadEmail = resultSet.getString("cad_email");
                String cadPassword = resultSet.getString("cad_password");
                String cadPasswordConf = resultSet.getString("cad_passwordconf");

                Cadastro cadastro = new Cadastro(cadId, cadUserName, cadEmail, cadPassword, cadPasswordConf);


                cadastros.add(cadastro);

            }

            System.out.println("success in select * cadastro");

            connection.close();

            return cadastros;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }

    }
    public void updateCadastro(Cadastro cadastro){
        String SQL = "UPDATE CADASTRO SET CAD_USERNAME = ?, CAD_EMAIL = ?, CAD_PASSWORD = ?, CAD_PASSWORDCONF = ? WHERE CAD_ID = ?";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();
            //Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,cadastro.getUsername());
            preparedStatement.setString(2,cadastro.getEmail());
            preparedStatement.setString(3,cadastro.getPassword());
            preparedStatement.setString(4,cadastro.getPasswordConf());

            preparedStatement.setString(7,cadastro.getCadId());

            preparedStatement.execute();

            System.out.println("success in update cadastro");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in datebase connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public void deleteCadastroById (String cadId){

        String SQL = "DELETE CADASTRO WHERE CAD_ID = ?";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            //Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadId);
            preparedStatement.execute();

            System.out.println("success on delete cadastro with cad_id: " + cadId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }
}
