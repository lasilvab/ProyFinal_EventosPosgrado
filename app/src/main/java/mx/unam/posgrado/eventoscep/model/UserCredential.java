package mx.unam.posgrado.eventoscep.model;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class UserCredential {
    public String userId;
    public String userName;
    public String userURL;
    public String userOrigin;


    public UserCredential(String userId, String userName, String userURL, String userOrigin ) {
        this.userName = userName;
        this.userId = userId;
        this.userURL = userURL;
        this.userOrigin = userOrigin;
    }
}
