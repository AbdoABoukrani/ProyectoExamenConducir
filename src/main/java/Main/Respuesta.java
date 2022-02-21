/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author ezekAbdo
 */
public class Respuesta {
    //* Creo un objeto respuestas para hacer un array de ellas y poder usarlas en el test

    protected int id, correcta;
    protected String preguntaString;

    public Respuesta(int idp, String ps, int correctaInt) {
        this.id = idp;
        this.correcta = correctaInt;
        this.preguntaString = ps;

    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correctaInt) {
        this.correcta = correctaInt;
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
