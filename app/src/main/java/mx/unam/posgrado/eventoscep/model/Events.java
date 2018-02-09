package mx.unam.posgrado.eventoscep.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class Events implements Serializable {
    @SerializedName("Eventos")
    @Expose
    private List<Eventos> eventos = new ArrayList<Eventos>();

    /**
     *
     * @return
     * The eventos
     */
    public List<Eventos> getEventos() {
        return eventos;
    }

    /**
     *
     * @param eventos
     * The Eventos
     */
    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }
}