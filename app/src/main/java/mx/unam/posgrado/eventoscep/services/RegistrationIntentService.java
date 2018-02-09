package mx.unam.posgrado.eventoscep.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.gcm.GcmPubSub;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

//import mx.unam.posgrado.eventoscep.R;

/**
 * Created by Luis Alfredo on 08/02/2018.
 */

public class RegistrationIntentService extends IntentService {
    public RegistrationIntentService() {
        super("RegistrationIntent");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            InstanceID instanceID = InstanceID.getInstance(this);
            //String registrationToken = instanceID.getToken(getString(R.string.gcm_defaultSenderId), GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            GcmPubSub subscription = GcmPubSub.getInstance(this);
            //subscription.subscribe(registrationToken, "/topics/MyEvents", null);
        }catch (Exception e){
            Log.d("RegistrationToken","FAILED: ",e);
        }
    }
}
