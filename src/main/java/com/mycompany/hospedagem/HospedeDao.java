package com.mycompany.hospedagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author joyce
 */
public class HospedeDao {
    
    public void adicionarHospede(Hospede h){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try{
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO hospedetable(nome, cpf, endereco, celular, email) VALUES(?,?,?,?,?)");
            stmt.setString(1, h.getNome());
            stmt.setString(2, h.getCPF());
            stmt.setString(3, h.getEndereco());
            stmt.setString(4, h.getCelular());
            stmt.setString(5, h.getEmail());
            
            stmt.executeUpdate(); 
        }catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Hospede> listarHospede(){
        List<Hospede> listaRetorno = new LinkedList<>();
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM hospedetable");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Hospede h = new Hospede(rs.getString("nome"),
                                        rs.getString("cpf"), 
                                        rs.getString("endereco"), 
                                        rs.getString("celular"),
                                        rs.getString("email"));
                listaRetorno.add(h);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    public Hospede getHospedePeloCpf(String CPF) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM hospedetable WHERE cpf=?");
            stmt.setString(1, CPF);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Hospede h = new Hospede(rs.getString("nome"),
                                    rs.getString("cpf"), 
                                    rs.getString("endereco"),
                                    rs.getString("celular"),
                                    rs.getString("email"));
                return h;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null; // não encontrou o hospede
    }
    
    public void updateHospede(Hospede h) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE hospedetable SET nome=?, endereco=?, celular=? WHERE cpf=?");
            stmt.setString(1, h.getNome());
            stmt.setString(2, h.getEndereco());
            stmt.setString(3, h.getCelular());
            stmt.setString(4, h.getCPF());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarHospede(String CPF) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM hospedetable WHERE cpf=?");
            stmt.setString(1, CPF);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }
    
}
