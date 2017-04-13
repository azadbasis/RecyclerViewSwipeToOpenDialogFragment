package com.token.firebase.azhar.firebasemessagetoken;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Azhar on 4/9/2017.
 */

public class MyToken extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("My Token", "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
      //  sendRegistrationToServer(refreshedToken);
    }
}
