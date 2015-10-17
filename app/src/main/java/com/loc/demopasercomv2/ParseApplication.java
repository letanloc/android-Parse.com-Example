package com.loc.demopasercomv2;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by loc on 17/10/2015.
 */
public class ParseApplication extends Application {

    public static String APPLICATION_ID = "6mWlVAQCMvwNfF7o91RRxF8m5gLAoMd4gWUYtO8W";
    public static String CLIENT_ID = "1KF8zy41APQOLYFEGQyw1NI8CWqJraPKKLSMO6ZY";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, APPLICATION_ID, CLIENT_ID);
        // taoj moojt paser progress
        // su dung them gia tri vao va luu vao
        // taoj ra moojt object moi
        // test app
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
        /* noi khoi tao mot object moi*/

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

    }
}
