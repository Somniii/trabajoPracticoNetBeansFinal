/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seahub.proyectoprogramacionseahub;
//importamos la utilidad para crear una lista en java
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ian Valentino Florentin Ramos Nicolas Lopez Zubizarreta
 * Esta clase sirve para tener un almacenamiento de todos los participantes habidos en algun torneo 
 * Para que no se repitan y para que puedan participar en otro torneo sabiendo su gmail
 */
public class ArrayListParticipante {
    //creamos una lista de arreglos en java
    //Como torneo y administrador , no estoy seguro si asi se genera una lista o si tiene que ser static

    List<Participante> listaParticipante = new ArrayList<Participante> ();
    //listaParticipante.add(new Participante());
    public ArrayListParticipante(){
        
    }

    public List<Participante> getListaParticipante() {
        return listaParticipante;
    }

    public void setListaParticipante(List<Participante> listaParticipante) {
        this.listaParticipante = listaParticipante;
    }
    
}
