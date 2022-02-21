/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno Tarde
 */
public class main {

    public static void main(String[] args) throws SQLException {

        VentanaOpciones vt = new VentanaOpciones();
        vt.setVisible(true);
        
    }

    //Hago una lista de preguntas indicando como parámetro la dificultad para que coja más o menos preguntas
    public static ArrayList<Pregunta> Preguntas(int dificultad) throws SQLException {
        ArrayList<Pregunta> listaPreguntas = new ArrayList();

        //Conexión con la base de datos y select de las preguntas para ponerlas en aleatorio como dicta la tarea
        var url = "jdbc:sqlite:examenConducir.db";
        Connection con = DriverManager.getConnection(url);
        
        String sql = "SELECT * FROM pregunta ORDER BY RANDOM() LIMIT " + dificultad + ";";
        Statement statement = con.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {

            listaPreguntas.add(new Pregunta(Integer.parseInt(rs.getString("id")), rs.getString("pregunta")));

        }

        return listaPreguntas;
    }

    // Algo algo parecido que con las preguntas pero usando el id de la pregunta para sacar sus respuestas
    public static ArrayList<Respuesta> Respuestas(int idPregunta) throws SQLException {
        ArrayList<Respuesta> listaRespuestas = new ArrayList();

        //Conexión con la base de datos y select de las respuestas en orden aleatorio como marca la tarea
        var url = "jdbc:sqlite:examenConducir.db";
        Connection con = DriverManager.getConnection(url);
        String sql = "SELECT * FROM RESPUESTAS WHERE respuestas.pregunta_id=" + idPregunta + " ORDER BY RANDOM() LIMIT 3;";
        Statement statement = con.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            
            listaRespuestas.add(new Respuesta(Integer.parseInt(rs.getString("pregunta_id")), rs.getString("respuesta"), Integer.parseInt(rs.getString("correcta"))));

        }

        return listaRespuestas;
    }

}
