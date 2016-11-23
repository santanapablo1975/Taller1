/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Pc12
 */
public class UsuarioModel {
    
    private String NombreJugador;
    private String Deporte;
    private int Edad;    

    /**
     * @return the NombreJugador
     */
    public String getNombreJugador() {
        return NombreJugador;
    }

    /**
     * @param NombreJugador the NombreJugador to set
     */
    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    /**
     * @return the Deporte
     */
    public String getDeporte() {
        return Deporte;
    }

    /**
     * @param Deporte the Deporte to set
     */
    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
