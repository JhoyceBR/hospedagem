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
public class ResidenciaDao {
    
    public void adicionarResidencia(Residencia r){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try{
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO residenciatable(codigo, rua, numero, bairro, cep, telefone, email, quartos) VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, r.getCodResidencia());
            stmt.setString(2, r.getRua());
            stmt.setInt(3, r.getNumero());
            stmt.setString(4, r.getBairro());
            stmt.setString(5, r.getCep());
            stmt.setString(6, r.getTelefone());
            stmt.setString(7, r.getEmail());
            stmt.setInt(8, r.getQuartos());
            
            stmt.executeUpdate(); 
        }catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void adicionarQuarto(Quarto q){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try{
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO quartotable(id_quarto, codresidencia, valordiaria, numeromaxhospede, arcondicionado, hidromassagem) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, q.getID());
            stmt.setString(2, q.getCodResidencia());
            stmt.setDouble(3, q.getValorDiaria());
            stmt.setInt(4, q.getNumeroMaxHospede());
            stmt.setBoolean(5, q.getArCondicionado());
            stmt.setBoolean(6, q.getHidromassagem());
            
            stmt.executeUpdate(); 
        }catch(SQLException e){
            e.printStackTrace();
            
        }finally{
            postgres.close(null, stmt, conexao);
        }
    }
    
    
    public List<Residencia> listarResidencias(){
        List<Residencia> listaRetorno = new LinkedList<>();
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM residenciatable");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Residencia r = new Residencia(rs.getString("codigo"),
                                        rs.getString("rua"),
                                        rs.getInt("numero"),
                                        rs.getString("bairro"), 
                                        rs.getString("cep"),
                                        rs.getString("telefone"),
                                        rs.getString("email"),
                                        rs.getInt("quartos"));
                listaRetorno.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    public List<Quarto> listarQuartos(String codigo){
        List<Quarto> listaRetorno = new LinkedList<>();
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM quartotable WHERE codresidencia=?");
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Quarto q = new Quarto(rs.getString("id_quarto"),
                                        rs.getString("codresidencia"),
                                        rs.getDouble("valordiaria"),
                                        rs.getInt("numeromaxhospede"),
                                        rs.getBoolean("arcondicionado"),
                                        rs.getBoolean("hidromassagem"));
                listaRetorno.add(q);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    
    public Residencia getResidenciaPeloCodigo(String codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM residenciatable WHERE codigo=?");
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Residencia r = new Residencia(rs.getString("codigo"),
                                    rs.getString("rua"), 
                                    rs.getInt("numero"),
                                    rs.getString("bairro"),
                                    rs.getString("cep"),
                                    rs.getString("telefone"),
                                    rs.getString("email"),
                                    rs.getInt("quartos"));
                return r;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null; 
    }
    
    public void updateResidencia(Residencia r) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE residenciatable SET rua=?, numero=?, bairro=?, cep=?, telefone=?, email=?, quartos=? WHERE codigo=?");
            stmt.setString(1, r.getRua());
            stmt.setInt(2, r.getNumero());
            stmt.setString(3, r.getBairro());
            stmt.setString(4, r.getCep());
            stmt.setString(6, r.getTelefone());
            stmt.setString(7, r.getEmail());
            stmt.setString(8, r.getCodResidencia());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void updateQuarto(Quarto q) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE quartotable SET valordiaria=?, numeromaxhospede=?, arcondicionado=?, hidromassagem=? WHERE id_quarto=?");
            stmt.setDouble(1, q.getValorDiaria());
            stmt.setInt(2, q.getNumeroMaxHospede());
            stmt.setBoolean(3, q.getArCondicionado());
            stmt.setBoolean(4, q.getHidromassagem());
            stmt.setString(6, q.getID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
           
    
    public void deletarQuarto(String codigoResidencia, String codigoQuarto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM quartotable WHERE codresidencia=? AND id_quarto=?");
            stmt.setString(1, codigoResidencia);
            stmt.setString(2, codigoQuarto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }
    
    public void deletarResidencia(String codigoResidencia) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM quartotable WHERE codresidencia=?");
            stmt.setString(1, codigoResidencia);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
        
        stmt = null;
        conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM residenciatable WHERE codigo=?");
            stmt.setString(1, codigoResidencia);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}

