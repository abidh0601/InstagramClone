package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register the subclass for use
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Dy6my5eB9c0wN8A26EEHyHAk1C169r8T7TBKBCui")
                .clientKey("tLLj5tBHfFCEKSJXZlOaNI6iewHngIfehR68qJgB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
