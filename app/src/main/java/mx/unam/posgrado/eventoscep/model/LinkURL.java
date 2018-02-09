package mx.unam.posgrado.eventoscep.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class LinkURL implements Serializable{
    @SerializedName("URL1")

    @Expose

    private String uRL1;

    @SerializedName("URL2")

    @Expose

    private String uRL2;

    @SerializedName("URL3")

    @Expose

    private String uRL3;

    @SerializedName("URL4")

    @Expose

    private String uRL4;

    public String getURL1() {

        return uRL1;

    }

    public void setURL1(String uRL1) {

        this.uRL1 = uRL1;
    }

    public String getURL2() {

        return uRL2;

    }
    public void setURL2(String uRL2) {

        this.uRL2 = uRL2;

    }

    public String getURL3() {

        return uRL3;
    }
    public void setURL3(String uRL3) {

        this.uRL3 = uRL3;

    }

    public String getURL4() {

        return uRL4;
    }

    public void setURL4(String uRL4) {

        this.uRL4 = uRL4;
    }
}
