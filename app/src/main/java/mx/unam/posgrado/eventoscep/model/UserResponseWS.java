package mx.unam.posgrado.eventoscep.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class UserResponseWS {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("clave")
    @Expose
    private String clave;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("correo")
    @Expose
    private String correo;
    @SerializedName("url")
    @Expose
    private String url;

    public String getid() {return id;}
    public String getclave() {return clave;}
    public String getnombre() {return nombre;}
    public String getcorreo() {return correo;}
    public String geturl() {return url;}
}
