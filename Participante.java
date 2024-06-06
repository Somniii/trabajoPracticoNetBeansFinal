/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seahub.proyectoprogramacionseahub;

/**
 *
 * @author ianel
 */
public class Participante extends Persona implements Email{
    private Torneo[] torneosActuales;
    private boolean estaVetado;
    private ResultadosAlmacenados metrica;

    public Participante() {
    }

    public Participante(Torneo[] torneosActuales, boolean estaVetado, ResultadosAlmacenados metrica) {
        this.torneosActuales = torneosActuales;
        this.estaVetado = estaVetado;
        this.metrica = metrica;
    }

    public Participante(Torneo[] torneosActuales, boolean estaVetado, ResultadosAlmacenados metrica, String nombre, String apellido, String email, int dni, int idPersona) {
        super(nombre, apellido, email, dni, idPersona);
        this.torneosActuales = torneosActuales;
        this.estaVetado = estaVetado;
        this.metrica = metrica;
    }

    public Torneo[] getTorneosActuales() {
        return torneosActuales;
    }

    public void setTorneosActuales(Torneo[] torneosActuales) {
        this.torneosActuales = torneosActuales;
    }

    public boolean isEstaVetado() {
        return estaVetado;
    }

    public void setEstaVetado(boolean estaVetado) {
        this.estaVetado = estaVetado;
    }

    public ResultadosAlmacenados getMetrica() {
        return metrica;
    }

    public void setMetrica(ResultadosAlmacenados metrica) {
        this.metrica = metrica;
    }
    
    public void enviarEmail(){
        
    }
    public void recibirEmail(){
        
    }
    
}
