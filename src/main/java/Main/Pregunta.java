/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;

/**
 *
 * @author ezekAbdo
 */
public class Pregunta {
    //* Creo un objeto pregunta para hacer un array de ellas y poder usarlas en el test

    protected int id;
    protected String preguntaString;

    public Pregunta(int idp, String ps) {
        this.id = idp;

        this.preguntaString = ps;

    }

    public int getId() {
        return id;
    }

    public void setId(int idp) {
        this.id = idp;
    }

    public String getPregunta() {
        return preguntaString;
    }

    public void setPregunta(String pregunta) {
        this.preguntaString = pregunta;
    }

}
