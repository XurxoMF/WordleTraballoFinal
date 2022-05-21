/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xurxo.martinez.wordle.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class MotorBD implements IMotorPalabras {

    private static String URL = "jdbc:sqlite:data/dbwordle.db";
    private String lang;

    public MotorBD(String lang) {
        this.lang = lang;
    }

    @Override
    public String getPalabraRandom() {
        List<String> palabras = new ArrayList<>();
        
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ?");) {
            ps.setString(1, this.lang);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    palabras.add(rs.getString("palabra"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return palabras.get((int) Math.floor(Math.random() * palabras.size()));
    }

    @Override
    public boolean existePalabra(String palabra) {
        List<String> palabras = new ArrayList<>();
        
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ?");) {
            ps.setString(1, this.lang);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    palabras.add(rs.getString("palabra"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return palabras.contains(palabra);
    }

    @Override
    public boolean anhadirPalabra(String palabra) {
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES (?, ?)");) {
            ps.setString(1, palabra);
            ps.setString(2, this.lang);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminarPalabra(String palabra) {
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ? AND lang = ?");) {
            ps.setString(1, palabra);
            ps.setString(2, this.lang);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean checkPalabra(String palabra) {
        return palabra.matches("[A-Z]{5}");
    }

}
