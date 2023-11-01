package dao;

import model.Reportar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReportarDao {
    public void createReportar(Reportar reportar){
        String SQL = "INSERT INTO REPORTAR (nome, email, zona, bairro, anonimo, mensagem) VALUES(?,?,?,?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,reportar.getName());
            preparedStatement.setString(2,reportar.getEmail());
            preparedStatement.setString(3,reportar.getZona());
            preparedStatement.setString(4,reportar.getBairro());
            preparedStatement.setString(5,reportar.getAnonimo());
            preparedStatement.setString(6,reportar.getMensagem());
            preparedStatement.execute();

            System.out.println("success in insert reportar");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public List<Reportar> findAllReportars() {

        String SQL = "SELECT * FROM REPORTAR";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Reportar> reportars = new ArrayList<>();

            while (resultSet.next()) {
                String repId = resultSet.getString("id");
                String repName = resultSet.getString("name");
                String repEmail = resultSet.getString("email");
                String repZona = resultSet.getString("zona");
                String repBairro = resultSet.getString("bairro");
                String repAnonimo = resultSet.getString("anonimo");
                String repMensagem = resultSet.getString("mensagem");

                Reportar reportar = new Reportar(repId, repName, repEmail, repZona, repBairro, repAnonimo, repMensagem);


                reportars.add(reportar);

            }

            System.out.println("success in select * reportar");

            connection.close();

            return reportars;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }

    }
    public void updateReportar(Reportar reportar){
        String SQL = "UPDATE REPORTAR SET NAME = ?, EMAIL = ?, ZONA = ?, BAIRRO = ?, ANONIMO = ?, MENSAGEM = ? WHERE ID = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,reportar.getName());
            preparedStatement.setString(2,reportar.getEmail());
            preparedStatement.setString(3,reportar.getZona());
            preparedStatement.setString(4,reportar.getBairro());
            preparedStatement.setString(5,reportar.getAnonimo());
            preparedStatement.setString(6,reportar.getMensagem());
            preparedStatement.setString(7,reportar.getId());

            preparedStatement.execute();

            System.out.println("success in update reportar");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in datebase connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public void deleteReportarById (String repId){

        String SQL = "DELETE REPORTAR WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, repId);
            preparedStatement.execute();

            System.out.println("success on delete reportar with id: " + repId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    }

