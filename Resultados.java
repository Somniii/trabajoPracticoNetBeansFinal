/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seahub.proyectoprogramacionseahub;

/**
 *
 * @author ianel
 */
public class Resultados {
    private Torneo torneo;
    private String ganador;
    private double tiempoTotal;
    private double[] tiempoPorEtapa;
    private Participante[] datosPosiciones;
    
    public Resultados(){
        
    }
    
    public Resultados(Torneo torneo, String ganador, double tiempoTotal, double[] tiempoPorEtapa, Participante[] datosPosiciones) {
        this.torneo = torneo;
        this.ganador = ganador;
        this.tiempoTotal = tiempoTotal;
        this.tiempoPorEtapa = tiempoPorEtapa;
        this.datosPosiciones = datosPosiciones;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(double tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public double[] getTiempoPorEtapa() {
        return tiempoPorEtapa;
    }

    public void setTiempoPorEtapa(double[] tiempoPorEtapa) {
        this.tiempoPorEtapa = tiempoPorEtapa;
    }

    public Participante[] getDatosPosiciones() {
        return datosPosiciones;
    }

    public void setDatosPosiciones(Participante[] datosPosiciones) {
        this.datosPosiciones = datosPosiciones;
    }
    
}
