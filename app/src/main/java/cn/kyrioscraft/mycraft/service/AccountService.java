package cn.kyrioscraft.mycraft.service;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import cn.kyrioscraft.mycraft.utils.Authenticator;

/**
 * Created by Kadmin on 2016/1/1.
 */
public class AccountService extends Service {

    private Authenticator authenticator;
    @Override
    public void onCreate() {
        super.onCreate();
        authenticator = new Authenticator(this);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return authenticator.getIBinder();
    }
}
