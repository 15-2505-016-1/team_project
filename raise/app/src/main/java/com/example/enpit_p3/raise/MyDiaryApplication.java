package com.example.enpit_p3.raise;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by enPiT-P9 on 2017/08/08.
 */

public class MyDiaryApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder() .build();
        Realm.setDefaultConfiguration(realmConfig);
    }
}