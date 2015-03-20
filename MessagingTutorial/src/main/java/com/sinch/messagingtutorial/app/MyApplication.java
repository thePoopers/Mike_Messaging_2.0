package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.PushService;


public class MyApplication extends Application {

    public static final String APP_ID = "aCFOhRA9gssJXdc1OTVMWXoZU2HhMIvf8Pu14WrJ";
    public static final String CLIENT_KEY = "gVIWFxhRe1iOAipsDAfYAijjXSpyrwAWL3QN1NsG";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, APP_ID, CLIENT_KEY);
        PushService.setDefaultPushCallback(this, ListUsersActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
