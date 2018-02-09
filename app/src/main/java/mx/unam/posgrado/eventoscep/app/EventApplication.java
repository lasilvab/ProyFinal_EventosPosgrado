package mx.unam.posgrado.eventoscep.app;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Luis Alfredo on 06/02/2018.
 */

public class EventApplication extends Application {
    @Override
    public void onCreate() {
        Fresco.initialize(this);
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
    }
}
