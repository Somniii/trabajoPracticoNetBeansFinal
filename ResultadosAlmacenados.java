/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seahub.proyectoprogramacionseahub;

/**
 *
 * @author ianel
 */
public class ResultadosAlmacenados {
    private Resultados[] resultados;
    private int torneosGanados;
    private double posicionPromedio;
    private double tiempoPromedio;
    private String[] listaTorneosParticipados;
    private int cantidadTorneosParticipados;

    public ResultadosAlmacenados() {
    }

    public ResultadosAlmacenados(Resultados[] resultados, int torneosGanados, double posicionPromedio, double tiempoPromedio, String[] listaTorneosParticipados, int cantidadTorneosParticipados) {
        this.resultados = resultados;
        this.torneosGanados = torneosGanados;
        this.posicionPromedio = posicionPromedio;
        this.tiempoPromedio = tiempoPromedio;
        this.listaTorneosParticipados = listaTorneosParticipados;
        this.cantidadTorneosParticipados = cantidadTorneosParticipados;
    }

    public Resultados[] getResultados() {
        return resultados;
    }

    public void setResultados(Resultados[] resultados) {
        this.resultados = resultados;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public double getPosicionPromedio() {
        return posicionPromedio;
    }

    public void setPosicionPromedio(double posicionPromedio) {
        this.posicionPromedio = posicionPromedio;
    }

    public double getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(double tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public String[] getListaTorneosParticipados() {
        return listaTorneosParticipados;
    }

    public void setListaTorneosParticipados(String[] listaTorneosParticipados) {
        this.listaTorneosParticipados = listaTorneosParticipados;
    }

    public int getCantidadTorneosParticipados() {
        return cantidadTorneosParticipados;
    }

    public void setCantidadTorneosParticipados(int cantidadTorneosParticipados) {
        this.cantidadTorneosParticipados = cantidadTorneosParticipados;
    }
    
}
