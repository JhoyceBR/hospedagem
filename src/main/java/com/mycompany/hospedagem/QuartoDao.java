/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class QuartoDao {
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

    public void deletarQuarto(String codigoQuarto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM quartotable WHERE id_quarto=?");
            stmt.setString(1, codigoQuarto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }
    
}
