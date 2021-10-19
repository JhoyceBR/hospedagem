
package com.mycompany.hospedagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author joyce
 */

public class AluguelDao {
    public void adicionarAluguel(Aluguel a){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try{
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO alugueltable(valor, diarias, hospede, quarto, dataentrada, datasaida, id) VALUES(?,?,?,?,?,?,?)");
            stmt.setDouble(1, a.CalcularValorFinal());
            stmt.setInt(2, a.CalcularDiarias());
            stmt.setString(3, a.getHospede().getCPF());
            stmt.setString(4, a.getQuarto().getID());
            stmt.setTimestamp(5, new  Timestamp(a.getDataEntrada().getTimeInMillis())); 
            stmt.setTimestamp(6, new  Timestamp(a.getDataSaida().getTimeInMillis()));
            stmt.setString(7, a.getId());
            
            
            stmt.executeUpdate(); 
        }catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Aluguel> listarAluguel(){
        List<Aluguel> listaRetorno = new LinkedList<>();
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT alugueltable.valor, alugueltable.diarias, alugueltable.datasaida, hospedetable.nome, quartotable.id_quarto FROM alugueltable INNER JOIN hospedetable ON alugueltable.hospede=hospedetable.cpf INNER JOIN quartotable ON alugueltable.quarto=quartotable.id_quarto");
            rs = stmt.executeQuery();
           
            while (rs.next()) { 
                /*
                Aluguel a = new Aluguel(rs.getString("hospede")),
                                        rs.getString("cpf"), 
                                        rs.getString("endereco"), 
                                        rs.getString("celular"),
                                        rs.getString("email"));
                listaRetorno.add(a);*/
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    
    public void updateAluguel(Aluguel a) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE alugueltable SET hospede=?, quarto=?, dataentrada=?, datasaida=? WHERE id=?");
            stmt.setString(1, a.getHospede().getCPF());
            stmt.setString(2, a.getQuarto().getID());
            stmt.setTimestamp(3, new  Timestamp(a.getDataEntrada().getTimeInMillis())); 
            stmt.setTimestamp(4, new  Timestamp(a.getDataSaida().getTimeInMillis()));
            stmt.setString(5, a.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarAluguel(String id) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM alugueltable WHERE id=?");
            stmt.setString(1, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }
    
}
