package com.example.tangyuan.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Tang yuan on 2016/9/8.
 */
public class MyService extends Service {
    private LocalBinder myBinder=new LocalBinder();
    public class LocalBinder extends Binder{
        MyService getService() {
            return MyService.this;
        }
    }
    public MyService() {
    }
    public int add(int x,int y){
        return x+y;
    }
    @Override
    public void onCreate() {
        Toast.makeText(MyService.this, "onCreate()", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "onStartCommand()", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        Toast.makeText(MyService.this, "onDestroy()", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(MyService.this, "onBind()", Toast.LENGTH_SHORT).show();
        return myBinder;
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(MyService.this, "onUnbind()", Toast.LENGTH_SHORT).show();
        return super.onUnbind(intent);
    }
}