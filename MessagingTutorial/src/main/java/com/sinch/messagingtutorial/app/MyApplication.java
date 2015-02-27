package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "aCFOhRA9gssJXdc1OTVMWXoZU2HhMIvf8Pu14WrJ", "gVIWFxhRe1iOAipsDAfYAijjXSpyrwAWL3QN1NsG");
    }
}
