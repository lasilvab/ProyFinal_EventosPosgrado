package mx.unam.posgrado.eventoscep.services;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class TokenRefreshListenerService extends InstanceIDListenerService{

    @Override
    public void onTokenRefresh(){
        Intent intent = new Intent(this,RegistrationIntentService.class);
        startService(intent);
    }
}
